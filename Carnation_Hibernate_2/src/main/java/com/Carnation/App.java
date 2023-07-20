package com.Carnation;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Carnation.entity.Marks;
import com.Carnation.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class)
													.addAnnotatedClass(Marks.class);
    	
    	SessionFactory sf =  cfg.buildSessionFactory();
    		
    	Session session = sf.openSession();
    	session.beginTransaction();
    	//----------
    	Student s1=new Student();
    	s1.setRollNo(1);
    	s1.setName("Arijit Singh");
    	s1.setAddress("Bengluru");
    	
    	session.save(s1);
    	
   	  Student s2=new Student();
    	s2.setRollNo(2);
    	s2.setName("SHREYA GHOSHAL");
    	s2.setAddress("kolkata");
    	
    	session.save(s2);   
    	
    	Marks m1=new Marks();
    	m1.setId(1);
    	m1.setMath(89);
    	m1.setEnglish(78);
    	m1.setStudent(s1);
    	session.save(m1);
    	
    	
   	Marks m2=new Marks();
    	m2.setId(2);
    	m2.setMath(56);
    	m2.setEnglish(69);
    	m2.setStudent(s2);
    	session.save(m2);   
    	
    	session.getTransaction().commit();
    	session.close();
    	
    }
}
