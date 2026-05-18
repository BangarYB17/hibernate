package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerDataAccess {

	public static void main(String[] args) {
		
		//step 1: Read data from hibernate configuration file
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		//step 2: use implicit object
		SessionFactory factory = conf.buildSessionFactory();
		
		//step 3: use implicit object
		Session session = factory.openSession();
		
		//step 4 :create object of java bean class
		Transaction tx = session.beginTransaction();
		Customer cust = new Customer("Vaibhav","Bhusaval","9025413658");
		session.save(cust);
		
		tx.commit();
		
		System.out.println("Data Added Successfully!");
		session.close();
		factory.close();
		
	}

}
