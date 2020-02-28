package com.clc.hbm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {
public static void main(String[] args) {
	 
	
	StudentEntity studen1=new  StudentEntity(710, "aaaa", 21);
	StudentEntity studen2=new  StudentEntity(222, "bbbb", 22);
	StudentEntity studen3=new  StudentEntity(300, "cccc", 23);
	StudentEntity studen4=new  StudentEntity(5500, "cccc", 23);
	
	Configuration confi=new Configuration().configure();
	SessionFactory sfac=confi.buildSessionFactory();
	Session session1=sfac.openSession();
	Transaction tr=session1.beginTransaction();
	
	session1.save(studen1);
	
	StudentEntity ss=session1.get(StudentEntity.class, 70);
	System.out.println(ss);	
	
	tr.commit();
	
	System.out.println("Student SAved...!");
	
	
	
	/* session.get(StudentEntity.class, 10); */
	
		
	
	
	/* System.out.println(ServiceImpl.getSingleStudent(10)); */
	
	/* System.out.println(ServiceImpl.updateStudent(10, "ravi", 25)); */
	
	/* ServiceImpl.deleteStudent(30); */ 
	
	/*
		 * System.out.println("Get Employee:");
		 * System.out.println(ServiceImpl.getSingleStudent(10));
		 */
		
		/*
		 * ServiceImpl.addStudent(studen1); ServiceImpl.addStudent(studen2);
		 * ServiceImpl.addStudent(studen3);
		 */
		
	//System.out.println(ServiceImpl.getSessionFactory().hashCode());
	
	if(true)
		return;
		
		System.out.println("<--Open Session() and getCurrentSession():--->");
		
		Configuration conf=new Configuration().configure().addAnnotatedClass(StudentEntity.class);
		SessionFactory sfa=conf.buildSessionFactory();
		Session session11=sfa.openSession();
		Session session12=sfa.openSession();
		Session session3=sfa.openSession();
		
		
		Session currentSession1=sfa.getCurrentSession();
		Session currentSession2=sfa.getCurrentSession();
		Session currentSession3=sfa.getCurrentSession();
		
		System.out.println("getCurrentSession1:"+currentSession1.hashCode());
		System.out.println("getCurrentSession2:"+currentSession2.hashCode());
		System.out.println("getCurrentSession3:"+currentSession3.hashCode());

}
}
