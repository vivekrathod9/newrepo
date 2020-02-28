package com.indexial.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {
	public static void main(String[] args) {

		Employee emp = new Employee(101, "Vivek");
		PerEmp pemp = new PerEmp(202, "Ravi", "Pune", 30202.20);
		ContEmp cemp = new ContEmp(303, "Suraj", 26, 2);

		SessionFactory factory = new Configuration().configure("/all-hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).addAnnotatedClass(PerEmp.class).addAnnotatedClass(ContEmp.class)
				.buildSessionFactory();

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(emp);
		session.save(pemp);
		session.save(cemp);

		session.flush();
		transaction.commit();
		session.close();
		System.out.println("Success...!");

	}

}
