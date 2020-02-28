package com.clc.embaded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {
	public static void main(String[] args) {

		EmbadedId compId1=new EmbadedId(10, "vivek", 25);
		EmbadedId compId2=new EmbadedId(20, "akask", 24);
		
		Employee emp1=new Employee(compId1, "vivek", 25	, "Pune");
		Employee emp2=new Employee(compId2, "akash", 23	, "Pusad");
		
		
		Configuration config=new Configuration().addAnnotatedClass(Employee.class);
		
		SessionFactory sfactory = config.buildSessionFactory();
		
		Session session=sfactory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.flush();
		tr.commit();
		System.out.println("Saved..!");
		
		
	}
}
