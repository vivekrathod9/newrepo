package com.clc.hbm;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ServiceImpl {

	static {
		Configuration conf = new Configuration().configure("/hibernate.cfg.xml").addAnnotatedClass(StudentEntity.class);
		SessionFactory sfa = conf.buildSessionFactory();
		Session s = sfa.openSession();
		Transaction tr = s.beginTransaction();
		s.flush();
		System.out.println(tr.isActive());
		tr.commit();
	}

	static SessionFactory sfactory = null;
	static Session session = null;
	static Transaction tr = null;

	public static SessionFactory getSessionFactory() {
		return sfactory = new Configuration().configure("/hibernate.cfg.xml").addAnnotatedClass(StudentEntity.class)
				.buildSessionFactory();
	}

	public static void addStudent(StudentEntity student) {
		ServiceImpl.getSessionFactory();
		session = sfactory.openSession();
		tr = session.beginTransaction();
		session.save(student);
		session.flush();
		tr.commit();
		System.out.println("Sttudent Saved Successfully...!");
	}

	public static StudentEntity getSingleStudent(int stdId) {
		ServiceImpl.getSessionFactory();
		session = sfactory.openSession();
		return (StudentEntity) session.get(StudentEntity.class, stdId);
	}

	public static void deleteStudent(int student) {
		StudentEntity s = getSingleStudent(student);
		if (s != null) {
			sfactory.openSession();
			session.beginTransaction();
			session.delete(s);
			session.flush();
			System.out.println("Student deleted Succesfully...!");
		}
	}

	public static StudentEntity updateStudent(int stdId, String stdName, int stdAge) {
		StudentEntity student = getSingleStudent(stdId);
		student.setStdName(stdName);
		student.setStdAge(stdAge);
		sfactory.openSession();
		session.beginTransaction();
		session.update(student);
		session.flush();
		System.out.println("Student Updated Succesfully...!");
		return student;
	}

	public static List<StudentEntity> getAllStudent() {
		sfactory.openSession();
		session.beginTransaction();
		return session.createCriteria(StudentEntity.class).list();
	}
}
