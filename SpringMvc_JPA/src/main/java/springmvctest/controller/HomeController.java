package springmvctest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springmvctest.dao.StudentDao;
import springmvctest.model.Student;


@Controller
public class HomeController {
	
	@Autowired
	private StudentDao studentDao;
	
	@RequestMapping("/")
	public String home() {
		
		
		return "index";
	}
	
	
	@ModelAttribute
	public void globalAttribute(Model model) {
		
		model.addAttribute("greet", "Welcome Back Students");
		
	}
	
	@PostMapping("addStudent")
	public String add(@ModelAttribute("output") Student s ) {
				
		studentDao.saveStudent(s);
		
		return "result";
	}
	
	@GetMapping("getAllStudents")
	public String getStudents(Model model) {
		
		List<Student> students = studentDao.getAllStudent();
		model.addAttribute("studentList", students);
		
		return "viewList";
	}
	
	
	@GetMapping("getStudent")
	public String getStudent(Model model ,@RequestParam("id") int id ) {
		
        Student student = studentDao.getStudent(id);
		model.addAttribute("student", student);
		
		return "viewList";
	}
	
	@PostMapping("deleteStudent")
	public String deleteStudent(@RequestParam("id") int id ) {

		studentDao.deleteStudent(id);
	
		return "delete";
	}
	
	

}
