package com.indexial.hbm.ManyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {
		Lecturer lecturer = new Lecturer(10, "Vivek");

		Subject sub1 = new Subject(101, "Java", lecturer);
		Subject sub2 = new Subject(102, "Python", lecturer);

		SessionFactory factory = new Configuration().configure("/manyToOne-hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(sub1);
		session.save(sub2);
		session.flush();
		transaction.commit();
		session.clear();

			System.out.println("Saved..ManyToOne...!");
	}
}
