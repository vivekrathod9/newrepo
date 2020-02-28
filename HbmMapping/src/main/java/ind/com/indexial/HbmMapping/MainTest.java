package ind.com.indexial.HbmMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {

	public static void main(String[] args) {

		Address d1 = new Address(10, "Pune1");
		Address d2 = new Address(20, "Pune2");

		Student s1 = new Student(101, "Vivek1", d1);
		Student s2 = new Student(102, "Vivek2", d2);

	SessionFactory factory=new Configuration().configure("/OneToOne-hibernate.cfg.xml").buildSessionFactory();
	Session  session=factory.openSession();
	Transaction transaction=session.beginTransaction();
	
	session.save(s1);
	session.save(s2);
	session.flush();
	transaction.commit();
	session.clear();
	System.out.println("Saved ...!");
	
	
	
	
	}
}
