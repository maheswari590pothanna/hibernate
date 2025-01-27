package com.jsp.hibernate.hibernate_fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
//		Person person = new Person();
//		person.setPersonId(1);
//		person.setPersonName("mahi");

//    	Person person1=new Person();
//    	person1.setPersonId(2);
//    	person1.setPersonName("tom");

//		Aadhar aadhar = new Aadhar();
//		aadhar.setAadharId(101);
//		aadhar.setAadharNumber(233456677997L);

//    	Aadhar aadhar1=new Aadhar();
//    	aadhar1.setAadharId(101);
//    	aadhar1.setAadharNumber(23345667697L);
//    	

		//person.setAadhar(aadhar);

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Aadhar.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();

//		session.save(person);
//		session.save(aadhar);
		
		Person person=session.get(Person.class, 1);
		System.out.println(person);
		//System.out.println(person.getAadhar());
		
		

		tran.commit();
		session.close();
		sf.close();

	}
}
