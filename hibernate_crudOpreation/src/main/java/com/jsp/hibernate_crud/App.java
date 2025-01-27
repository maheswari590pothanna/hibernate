package com.jsp.hibernate_crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
//		Student student = new Student();
//		student.setStudentId(1);
//		student.setStudentName("mahi");
//		student.setStudentEmail("mahi@gmail.com");
//
//		Student student1 = new Student();
//		student1.setStudentId(2);
//		student1.setStudentName("tom");
//		student1.setStudentEmail("tom@gmail.com");
//
//		Student student2 = new Student();
//		student2.setStudentId(3);
//		student2.setStudentName("jerry");
//		student2.setStudentEmail("jerry@gmail.com");

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();

//		session.save(student);
//		session.save(student1);
//		session.save(student2);
		
		
		session.get(Student.class, 1);

		tran.commit();
		session.close();
		sf.close();

	}
}
