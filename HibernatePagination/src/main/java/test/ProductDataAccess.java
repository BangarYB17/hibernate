package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductDataAccess {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(new Products("Chair", 500.00, 50));
		session.save(new Products("Table", 2500.00, 20));
		session.save(new Products("Laptop", 55000.00, 10));
		session.save(new Products("Mobile", 18000.00, 35));
		session.save(new Products("Keyboard", 800.00, 60));
		session.save(new Products("Mouse", 400.00, 75));
		session.save(new Products("Monitor", 12000.00, 15));
		session.save(new Products("Printer", 9500.00, 12));
		session.save(new Products("Sofa", 22000.00, 8));
		session.save(new Products("Fan", 1800.00, 40));
		session.save(new Products("AC", 35000.00, 6));
		session.save(new Products("Bed", 15000.00, 10));
		session.save(new Products("Cupboard", 17000.00, 7));
		session.save(new Products("Bookshelf", 4500.00, 18));
		session.save(new Products("Dining Table", 27000.00, 5));
		
		tx.commit();
		
		session.close();
		factory.close();
		
		System.out.println("Record Added Successfully!");

	}

}
