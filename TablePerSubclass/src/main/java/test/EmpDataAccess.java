package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDataAccess {

	public static void main(String[] args) {
		Configuration conf= new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx =session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setName("Nagya");
		
		Reg_emp e2 = new Reg_emp();
		e2.setName("Abhi");
		e2.setSalary(625);
		e2.setBonus(10);
		
		Contract_emp e3 = new Contract_emp();
		e3.setName("Ram");
		e3.setPay_per_hour(1120);
		e3.setContract_period("4 Year");
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		tx.commit();
	
        session.close();
        factory.close();
        
        System.out.println("Details Added Successfully!");
	}

}
