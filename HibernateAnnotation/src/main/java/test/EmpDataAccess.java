package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDataAccess {

	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory factory = con.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx =session.beginTransaction();
		
		Employee emp = new Employee();
		
		emp.setName("Lekhit LevaPatil");
		emp.setSalary(5.50);
		
		session.persist(emp);
		tx.commit();
		
		session.close();
		factory.close();
		
		System.out.println("Record Added Successfully!");

	}

}
