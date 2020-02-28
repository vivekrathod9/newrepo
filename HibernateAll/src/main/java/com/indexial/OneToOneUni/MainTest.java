package com.indexial.OneToOneUni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {
	public static void main(String[] args) {

		District d1 = new District(101, "Yavatmal", 19);
		District d2 = new District(102, "Amravati", 21);

		City c1 = new City(10, "Pusad", 304331, d1);
		City c2 = new City(20, "Digras", 224132, d2);

		SessionFactory factory = new Configuration().configure("/mapping-hibernate.cfg.xml")
				.addAnnotatedClass(District.class).addAnnotatedClass(City.class).buildSessionFactory();
		
		Session crrnt = factory.getCurrentSession();
		System.out.println("current: "+crrnt.hashCode());

		Session crrnt2 = factory.getCurrentSession();
		System.out.println("current: "+crrnt2.hashCode());
		
		Session session = factory.openSession();
		System.out.println("session: "+session.hashCode());
		
		Session session2 = factory.openSession();
		System.out.println("session: "+session2.hashCode());
		
		Transaction transaction = session.beginTransaction();

		/*session.save(c1);
		session.save(c2);
		*/transaction.commit();
		session.close();
		System.out.println("Done...!");

	}
}
