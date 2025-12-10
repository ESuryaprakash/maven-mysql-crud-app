package com.kodnest.Update.Update_maven_project;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    @SuppressWarnings("removal")
	public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);

    	SessionFactory factory = new Configuration().configure("hibernet.cfg.xml").buildSessionFactory();

    	Session session=factory.openSession();

    	Transaction transaction=session.beginTransaction();

    	System.out.println("Enter id of a student to update name and email update ");

    	int id = scan .nextInt();

    	Student obj=session.get(Student.class, id);

    	if(obj!=null) {

    		System.out.println("Enter new name");

    		String name = scan.next();

    		String email=scan.next();

    		obj.setName(name);

    		obj.seteMail(email);

    		session.persist(obj);

    		System.out.println("Updated Successfully");

    	}

    	else {

    		System.out.println("Student with id "+id+" not found to update");

    	}

    	transaction.commit();

    	session.close();

    	factory.close();

    	scan.close();

    }

}
