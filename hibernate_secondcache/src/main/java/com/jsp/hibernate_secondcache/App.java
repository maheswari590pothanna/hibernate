package com.jsp.hibernate_secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
//		Employee employee = new Employee();
//		employee.setEmployeeId(1);
//		employee.setEmployeeName("mahi");

		Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();

		Employee employee = session.get(Employee.class, 1);
		System.out.println(employee);

		Employee employee1 = session.get(Employee.class, 1);
		System.out.println(employee1);

		// session.save(employee);

		tran.commit();
		session.close();
		System.out.println("================================================");

		Session session1 = sf.openSession();
		Transaction tran1 = session1.beginTransaction();

		Employee employee3 = session1.get(Employee.class, 1);
		System.out.println(employee3);

		Employee employee4 = session1.get(Employee.class, 1);
		System.out.println(employee4);

		tran1.commit();
		session1.close();

		sf.close();

	}
}
