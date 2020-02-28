package com.indexial.OneToOneBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {
	public static void main(String[] args) {

		District d1 = new District(101, "Yavatmal", 19, null);
		District d2 = new District(102, "Amravati", 21, null);

		City c1 = new City(10, "Pusad", 304331, d1);
		City c2 = new City(20, "Darwah", 224132, d2);

		d1.setCity(c1);
		d2.setCity(c2);
		SessionFactory factory = new Configuration().configure("/mapping-hibernate.cfg.xml")
				.addAnnotatedClass(District.class).addAnnotatedClass(City.class).buildSessionFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(c1);
		session.save(c2);
		session.save(d1);
		session.save(d2);
		transaction.commit();
		session.close();
		System.out.println("Done...!");

	}
}
