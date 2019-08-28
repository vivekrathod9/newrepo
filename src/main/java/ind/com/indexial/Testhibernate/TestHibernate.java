package ind.com.indexial.Testhibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernate {

	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Vivek", 25, "Pune");
		Employee e2 = new Employee(20, "suraj", 23, "Pusad");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(e1);
		session.flush();
		transaction.commit();
	}

}
