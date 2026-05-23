package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");

		SessionFactory factory = conf.buildSessionFactory();

		Session session = factory.openSession();

		/*
		 * List<Student> l1 = session.createQuery("from Student",Student.class).list();
		 * for(Student s1:l1) {
		 * System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAge()); }
		 */
		/*
		 * Criteria c1 = session.createCriteria(Student.class); List<Student> l1
		 * =c1.list(); for(Student s1:l1) {
		 * System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAge()); }
		 */

		/*
		 * Query q =session.createQuery("from Student where age=25"); List<Student> l3 =
		 * q.list(); for(Student s1:l3) { System.out.println(s1.getId()+" "
		 * +s1.getName()); }
		 */

		/*Query q = session.createQuery("from Student where age>35");
		List<Student> l3 = q.list();
		for (Student s1 : l3) {
			System.out.println(s1.getId() + " " + s1.getName() + " " + s1.getAge());
		}*/

		/*Query q = session.createQuery("select distinct name from Student");
		List<String> l3 = q.list();
		for (String s1 : l3) {
			System.out.println(s1);
			
		} */
		/*Query q = session.createQuery("from Student where age between 30 and 40");
		List<Student> l3 = q.list();
		for (Student s1 : l3) {
			System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAge());
	
		}*/
		/*Query q = session.createQuery("from Student where age IN(30,40)");
		List<Student> l3 = q.list();
		for (Student s1 : l3) {
			System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAge());
	
		}*/
		
		Query q = session.createQuery("from Student",Student.class);
		q.setFirstResult(0); // for offset
		q.setMaxResults(2); // for limit 
		List<Student> l3 = q.list();
		for (Student s1 : l3) {
			System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getAge());
	
		}
        
		session.close();
		factory.close();

		System.out.println("Details Added Successfully!");

	}

}
