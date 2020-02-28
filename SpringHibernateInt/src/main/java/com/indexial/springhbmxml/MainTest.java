package com.indexial.springhbmxml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory factory = (SessionFactory) context.getBean("mysessionFactory");
		
		Student student=new Student(10, "viv", new Subject(20, "math"));
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(student);
		transaction.commit();
		System.out.println("Saved..!");
	}
}
