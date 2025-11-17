package com.selenium.JPADemo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class App 
{
    public static void main( String[] args )
    {
    	Student s = new Student();
    	
    	s.setSname("mrmr");
    	s.setMarks(99);
       
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("db1");
    	
    	EntityManager em = emf.createEntityManager();
    	
    	//Student student = em.find(Student.class, 5);
    	
    	em.getTransaction().begin();
    	
    	em.persist(s);
    	
    	em.getTransaction().commit();
    	
    	System.out.println(s);
    }
}
