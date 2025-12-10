package com.kodnest.delete.Delete_Maven_Project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    @SuppressWarnings("removal")
	public static void main(String[] args) {
        //Hibernet Steps
    	// Strp1 and step2 
    	SessionFactory factory = new Configuration().configure("hibernet.cfg.xml").buildSessionFactory();
    	
    	//Step3
    	Session session = factory.openSession();
    	//Step4
    	Transaction transaction = session.beginTransaction();
    	//Step5
    	// check wether data is resent or not if present then delete
    	Student obj = session.get(Student.class,1);
    	
    	if(obj!=null) {
    		session.remove(obj);
    		System.out.println("Student deleted Sucessfully");
    	} else {
    		System.out.println("Student doesnot Exits");
    	}
    	transaction.commit();
    	session.close();
    	factory.close();
    }
}
