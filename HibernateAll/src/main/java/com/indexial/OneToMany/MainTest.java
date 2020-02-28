package com.indexial.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {
	public static void main(String[] args) {

		City c1 = new City(10, "Pusad", 304331);
		City c2 = new City(20, "Darwah", 224132);
		List<City> city=new ArrayList<City>();
		city.add(c1);
		city.add(c2);
		
		District dist= new District(101, "Yavatmal", 19, city);
		
		SessionFactory factory = new Configuration().configure("/mapping-hibernate.cfg.xml")
				.addAnnotatedClass(District.class).addAnnotatedClass(City.class).buildSessionFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(dist);
		
		transaction.commit();
		session.close();
		System.out.println("Done...!");

	}
}
