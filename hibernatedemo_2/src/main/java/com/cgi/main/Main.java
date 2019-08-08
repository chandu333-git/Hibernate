package com.cgi.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


import com.cgi.model.Student;
import com.cgi.repository.StudentRepository;


public class Main {

	public static void main(String[] args) {
	
		Student stu=new Student();
		   Scanner scanner=new Scanner(System.in);
		   StudentRepository student =new StudentRepository();
		   
		      int choice;
				while(true)
				{
					System.out.println("1) ADD STUDENT");
					System.out.println("2)DELETE STUDENT");
					System.out.println("3)UPDATE STUDENT");
					System.out.println("4)DISPLAY STUDENTS");
					System.out.println("Enter your choice");
					choice=scanner.nextInt();
				switch(choice)
				{
				
				case 1:     
				                System.out.println("enter the id");
				                int id = scanner.nextInt();
				                System.out.println("enter the first name");
				                String fname = scanner.next();
				                System.out.println("enter the last name");
				                String lname = scanner.next();
				                System.out.println("enter the section");
				                String section = scanner.next();
				                stu.setId(id);
				                stu.setFirstName(fname);
				                stu.setLastName(lname);
				                stu.setSection(section);
				                student.addStudent(stu);
				                break;
				            case 2:
				                System.out.println("enter id to be updated");
				                int id1 = scanner.nextInt();
				                stu.setId(id1);
				                student.deleteStudent(id1);
				                break;
				            case 3:System.out.println("enter id to be deleted");
				            int id11 = scanner.nextInt();
				            stu.setId(id11);
				            student.update(id11);
				            break;
				            
				            case 4:List<Student> stuList=student.getAllStudents();
				            for(Student st:stuList) {
				                System.out.println(st.getId()+"\t"+st.getFirstName()+"\t"+st.getLastName()+"\t"+st.getSection()+"\t");;
				            }
				            break;
				            case 5:
				                System.exit(0);
                
                
	}}
	}
}
