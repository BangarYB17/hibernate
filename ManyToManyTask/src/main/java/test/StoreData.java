package test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf = new Configuration();
		conf.configure();

		SessionFactory factory = conf.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Courses c1 = new Courses();
		c1.setCname("Java");

		Courses c2 = new Courses();
		c2.setCname("Python");

		Courses c3 = new Courses();
		c3.setCname("DataScience");

		Student s1 = new Student();
		s1.setSname("Ram");

		Student s2 = new Student();
		s2.setSname("Lekhit");

		Student s3 = new Student();
		s3.setSname("Jayesh");

		ArrayList<Courses> co1 = new ArrayList<Courses>();
		co1.add(c1);
		co1.add(c2);
		co1.add(c3);

		ArrayList<Student> st1 = new ArrayList<Student>();
		st1.add(s1);
		st1.add(s2);
		st1.add(s3);

		s1.setCourses(co1);
		s2.setCourses(co1);
		s3.setCourses(co1);

		session.persist(s1);
		session.persist(s2);
		session.persist(s3);

		tx.commit();
		session.close();
		factory.close();

		System.out.println("Record inserted successfully!");

	}

}
