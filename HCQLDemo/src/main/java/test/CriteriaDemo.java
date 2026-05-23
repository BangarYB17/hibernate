package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaDemo {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");

		SessionFactory factory = conf.buildSessionFactory();

		Session session = factory.openSession();

		/*
		 * Criteria c1 =session.createCriteria(Student.class); List<Student> l3 =
		 * c1.list(); for(Student s1:l3) { System.out.println(s1.getId()+" "
		 * +s1.getName()+" "+s1.getAge()); }
		 */

		/*Criteria c1 = session.createCriteria(Student.class);
		c1.add(Restrictions.gt("age", 35));
		List<Student> list = c1.list();
		for (Student s1 : list) {
			System.out.println(s1.getId() + " " + s1.getName());
		}*/
		
		/*Criteria c1=session.createCriteria(Student.class);
		c1.setProjection(Projections.distinct(Projections.property("age")));
		List<Integer> l3 = c1.list();
		for (Integer s1 : l3) {
			System.out.println(s1);	
		}
		Criteria c2=session.createCriteria(Student.class);
		c1.setProjection(Projections.distinct(Projections.property("name")));
		List<String> l4 = c1.list();
		for (String s1 : l4) {
			System.out.println(s1);	
		}*/
		
		/*Criteria c1=session.createCriteria(Student.class);
		c1.add(Restrictions.or(Restrictions.lt("age", 20), Restrictions.gt("age", 40)));
		List<Student> l4 = c1.list();
		for (Student s1 : l4) {
			System.out.println(s1.getName()+" "+s1.getAge());	
		} */
		
		/*Criteria c1=session.createCriteria(Student.class);
		c1.addOrder(Order.desc("age"));
		List<Student> l4 = c1.list();
		for (Student s1 : l4) {
			System.out.println(s1.getName()+" "+s1.getAge());	
		}*/
		
		/*Criteria c1 = session.createCriteria(Student.class);
//		c1.add(Restrictions.gt("age", 30)).addOrder(Order.asc("age"));
		c1.add(Restrictions.gt("age", 30));
		c1.addOrder(Order.asc("age"));
		
		List<Student> list = c1.list();
		for (Student s1 : list) {
			System.out.println(s1.getId() + " " + s1.getName()+" "+s1.getAge());
		} */
		
		/*Criteria c1 = session.createCriteria(Student.class);
		c1.add(Restrictions.or(Restrictions.eq("age", 25),Restrictions.eq("age", 39)));
		
		
		List<Student> list = c1.list();
		for (Student s1 : list) {
			System.out.println(s1.getId() + " " + s1.getName()+" "+s1.getAge());
		}*/
		
		/*Criteria c1 = session.createCriteria(Student.class);
		c1.add(Restrictions.and(Restrictions.eq("age", 39),Restrictions.eq("id", 1)));
		
		
		List<Student> list = c1.list();
		for (Student s1 : list) {
			System.out.println(s1.getId() + " " + s1.getName()+" "+s1.getAge());
		}*/
		/*Criteria c1 = session.createCriteria(Student.class);
		c1.add(Restrictions.like("name", "j%"));
		
		
		List<Student> list = c1.list();
		for (Student s1 : list) {
			System.out.println(s1.getId() + " " + s1.getName()+" "+s1.getAge());
		}*/
		
		Criteria c1 = session.createCriteria(Student.class);
		c1.add(Restrictions.like("name", "a%"));
		
		
		List<Student> list = c1.list();
		for (Student s1 : list) {
			System.out.println(s1.getId() + " " + s1.getName()+" "+s1.getAge());
		}
		
		
		session.close();
		factory.close();

		System.out.println("Details Added Successfully!");

	}

}
