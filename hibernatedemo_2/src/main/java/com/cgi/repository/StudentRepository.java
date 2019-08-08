package com.cgi.repository;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.cgi.model.Student;

public class StudentRepository {
	
	private Session session;
    private SessionFactory sessionFactory;
	public StudentRepository() {
		
		
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	
	}
	  public void addStudent(Student student)
	  {
		  Session session= sessionFactory.openSession();
		  session.beginTransaction();
		 session.save(student);
		  session.getTransaction().commit();
	       session.close();
	  }

	       public void update(int id)
	       {
	    	    Session session = sessionFactory.openSession();
	            session.beginTransaction();
	            Student student = (Student) session.get(Student.class, id);
	            Scanner sc = new Scanner(System.in);
	            System.out.println("enter ur choice to be updated");
	            System.out.println("1) FIRST_Name");
	            System.out.println("2) LAST_Name");
	            System.out.println("3) SECTION");
	            System.out.println("4) exit");
	            int choice;
	            choice = sc.nextInt();
	            switch (choice) {
	            case 1:
	                System.out.println("enter the first name to be updated");
	                String firstname = sc.next();
	                student.setFirstName(firstname);
	                break;
	            case 2:
	                System.out.println("enter the last name to be updated");
	                String lastname = sc.next();
	                student.setLastName(lastname);
	                break;
	            case 3:
	                System.out.println("enter the section to be updated");
	                String section = sc.next();
	                student.setSection(section);
	                break;
	            }
	            // student.setSection(section);
	            session.update(student);// No need to update manually as it will be updated automatically on transaction
	                                    // close.
	            session.getTransaction().commit();
	            session.close();
	        }
	
	  public void deleteStudent(int id) {
	       Session session = sessionFactory.openSession();
	       session.beginTransaction();
	       Student student = (Student) session.get(Student.class, id);
	       session.delete(student);
	       session.getTransaction().commit();
	       session.close();
	   }
	public List<Student> getAllStudents() {
	       Session session = sessionFactory.openSession();
	               List<Student> employees = (List<Student>) session.createQuery(
	               "FROM Student s ORDER BY s.firstName ASC").list();
	               session.getTransaction().commit();
	                session.close();
	                return employees;
	}
	
	
	   }
	

	


