package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDataAccess {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");

		SessionFactory factory = conf.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(new Student("Jayesh", 39));
		session.save(new Student("Lekhit", 33));
		session.save(new Student("Abhi", 49));
		session.save(new Student("Vaibhav", 33));
		session.save(new Student("Rohit", 28));
		session.save(new Student("Anish", 24));
		session.save(new Student("Roy", 29));
		session.save(new Student("Shyam", 25));
		session.save(new Student("John", 31));
		session.save(new Student("Shiv", 25));
		session.save(new Student("Anand", 27));

		tx.commit();
		session.close();
		factory.close();

		System.out.println("Details Added!");
	}

}
