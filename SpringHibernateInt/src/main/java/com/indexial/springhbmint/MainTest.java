package com.indexial.springhbmint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpConfig.class);
		SessionFactory sfactory = (SessionFactory) context.getBean("factory");
		
		Address ad= new Address(201, "pune", "mh");
		Employee emp = new Employee(101, "vivek", 1289.21,ad);
		
		Session session = sfactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ad);
		session.save(emp);
		
		transaction.commit();
		System.out.println("Saved...!");
	}

}
