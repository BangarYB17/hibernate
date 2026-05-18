package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDataAccess {

	public static void main(String[] args) {
		Configuration conf= new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx =session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setName("Nagya");
		
		Reg_Emp e2 = new Reg_Emp();
		e2.setName("Lekhit");
		e2.setSalary(5.50);
		e2.setBonus(1.0);
		
		Contract_Emp e3 = new Contract_Emp();
		e3.setName("Vaibhav");
		e3.setPay_per_hour(120.00);
		e3.setContract_period("1 Year");
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		tx.commit();
	
        session.close();
        factory.close();
        
        System.out.println("Details Added Successfully!");
	}

}
