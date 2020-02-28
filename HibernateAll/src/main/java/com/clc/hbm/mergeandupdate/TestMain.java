package com.clc.hbm.mergeandupdate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "viv");
		Employee e2 = new Employee(3, "aka");
		Employee e3 = new Employee(2, "swa");

		Session sf = HibernateProp.getSessionFactory().openSession();
		Transaction tr = sf.beginTransaction();
		/*sf.save(e1);
		sf.save(e2);
		sf.save(e3);*/
		/*
		Employee e = new Employee(2, "aaaa");
		sf.update(e);*/
		//sf.delete(e2);
		
/*		Employee emp = sf.get(Employee.class, 1);
		System.out.println("Employee:" + emp);
*/		sf.flush();
		tr.commit();

		System.out.println("Saved.>!");

	}

}
