package test;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();

		SessionFactory factory = conf.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Answer ans1 = new Answer();
		ans1.setAnsname("Platform Independent");
		ans1.setPostedby("Ram");

		Answer ans2 = new Answer();
		ans2.setAnsname("Programming language");
		ans2.setPostedby("Lekhit");

		Answer ans3 = new Answer();
		ans3.setAnsname("Secure");
		ans3.setPostedby("Jayesh");
		
		Question q1 = new Question();
		q1.setQname("What is java?");

		Question q2 = new Question();
		q2.setQname("feature of java?");
	
		Question q3 = new Question();
		q3.setQname("Java means?");
		
		ArrayList<Answer> a1 = new ArrayList<Answer>();
		a1.add(ans1);
		a1.add(ans2);
		a1.add(ans3);
		
		ArrayList<Question> que1 = new ArrayList<Question>();
		que1.add(q1);
		que1.add(q2);
		que1.add(q3);
	    
	    q1.setAnswers(a1);
	    q2.setAnswers(a1);
	    q3.setAnswers(a1);
	    
	    session.persist(q1);
	    session.persist(q2);
	    session.persist(q3);
	    
	    tx.commit();
	    System.out.println("***** Question Table *****");
	    for(Question que:que1) {
			System.out.println(que.getId()+" "+que.getQname());
		}
	    System.out.println("***** Answer Table *****");
	    for(Answer an:a1) {
			System.out.println(an.getId()+" "+an.getAnsname()+" , "+an.getPostedby());
		}
	    session.close();
	    factory.close();
	    
	    System.out.println("Data inserted successfully!");
	}

}
