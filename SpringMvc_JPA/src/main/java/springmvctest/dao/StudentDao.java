package springmvctest.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import springmvctest.model.Student;

@Component
public class StudentDao {

	
	@PersistenceContext(unitName = "mysqldb")
	EntityManager entityManager;
	
	@Transactional
	public void saveStudent(Student student) {

		entityManager.persist(student);
		System.out.println("student saved successfully");
		
	}
	
	
	@Transactional
	public List<Student> getAllStudent() {

	    List<Student> list = entityManager.createQuery("from Student" , Student.class).getResultList();
	
		return list;
	}
	
	
	@Transactional
	public Student getStudent(int id) {

	    Student student = entityManager.find(Student.class, id);	
		return student;
	}
	
	@Transactional
	public void deleteStudent(int id) {

	    Student student = getStudent(id);
	    entityManager.remove(student);
	}
	
}
