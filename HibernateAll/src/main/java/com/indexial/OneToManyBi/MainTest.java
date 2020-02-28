package com.indexial.OneToManyBi;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {
	public static void main(String[] args) {

		City c1 = new City(10, "Pusad", 304331,null);
		City c2 = new City(20, "Darwah", 224132,null);
		List<City> city=new ArrayList<City>();
		city.add(c1);
		city.add(c2);
		
		District dist= new District(101, "Yavatmal", 19, city);
		c1.setDistrict(dist);
		c2.setDistrict(dist);
		
		SessionFactory factory = new Configuration().configure("/mapping-hibernate.cfg.xml")
				.addAnnotatedClass(District.class).addAnnotatedClass(City.class).buildSessionFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(dist);
		session.save(c1);
		session.save(c2);
		
		transaction.commit();
		session.close();
		System.out.println("Done...!");

	}
}
