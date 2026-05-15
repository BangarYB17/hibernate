package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDataAccess {

	public static void main(String[] args) {

		// Step 1: Reading details from hibernate configuration file
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");

		// step 2: use the implicit object
		SessionFactory factory = conf.buildSessionFactory();

		// step 3: use implicit object
		Session session = factory.openSession();

		// step 4: create a object of bean class
		// to perform operation on table --> implicit object (Transaction )
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee("rohan", 56000.00);
		session.save(emp);

		tx.commit();
		System.out.println("Data inserted successfully");
		session.close();
		factory.close();
	}
}
