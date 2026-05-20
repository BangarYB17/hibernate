package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee e1 =new Employee();
		e1.setName("Lekhit Zamya");
		e1.setEmail("lekhit@gmail.com");
		
		Employee e2 =new Employee();
		e2.setName("jayesh nagya");
		e2.setEmail("jayesh@gmail.com");
		
		Employee e3 =new Employee();
		e3.setName("abhi shendge");
		e3.setEmail("abhi@gmail.com");
		
		Address a1 = new Address();
		a1.setAdressline("akurdi");
		a1.setCity("pune");
		a1.setState("maharashtra");
		a1.setCountry("india");
		a1.setPincode(411035);
		
		e1.setAddress(a1);
		e2.setAddress(a1);
		e3.setAddress(a1);
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record added Successfully!");

	}

}
