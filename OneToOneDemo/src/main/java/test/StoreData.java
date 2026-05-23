package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		Configuration conf= new Configuration();
		conf.configure();
		
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Person p1 = new Person();
		p1.setName("Yogeshwar");
		
		Passport ps1 = new Passport();
		ps1.setP_number("YB10022004");

		p1.setPassport(ps1);

		session.save(p1);
		tx.commit();
		
		session.close();
		factory.close();
		
		System.out.println("Data Inserted Successfully!");
	}

}
