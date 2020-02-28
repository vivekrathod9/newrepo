package com.indexial.hbm.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {

		Book b1 = new Book(10, "Physics");
		Book b2 = new Book(20, "Math");
		Book b3 = new Book(30, "Chemestry");
		List<Book> book = new ArrayList<Book>();
		book.add(b1);
		book.add(b2);
		book.add(b3);
		
		Library library =new Library(101, "Swami Vivekanad", book);
		
		SessionFactory factory=new Configuration().configure("/OneToMany-hibernate.cfg.xml").buildSessionFactory();
		Session  session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.save(library);
		session.flush();
		transaction.commit();
		session.clear();
		System.out.println("Saved...One to Many...!");
		
		
		
	}

}
