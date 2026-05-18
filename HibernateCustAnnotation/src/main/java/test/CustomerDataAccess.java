package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerDataAccess {

	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Customer c = new Customer("Roy","Nanded","9125478596");
		session.save(c);
		
		tx.commit();
		System.out.println("Record Added Successfully");
		session.close();
		factory.close();
		

	}

}
