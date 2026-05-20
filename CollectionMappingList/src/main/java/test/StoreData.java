package test;

import java.util.ArrayList;

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
		
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Java is a programming language");
		l1.add("Java is platform independent");
		l1.add("Java is secure");
		
		Question q1 = new Question(); 
		q1.setQname("What is java");
		q1.setAnswer(l1);
		
		session.persist(q1);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("Data stored successfully!");
	}

}
