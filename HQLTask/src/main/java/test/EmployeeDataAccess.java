package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDataAccess {

	public static void main(String[] args) {
          Configuration conf = new Configuration();
          conf.configure("hibernate.cfg.xml");
          
          SessionFactory factory = conf.buildSessionFactory();
          
          Session session = factory.openSession();
          
          Transaction tx = session.beginTransaction();
          
          session.save(new Employee("Amit","IT",55000,"pune"));
          session.save(new Employee("Neha","HR",40000,"Mumbai"));
          session.save(new Employee("Rahul","IT",60000,"Delhi"));
          session.save(new Employee("Priya","Finance",55000,"Pune"));
          session.save(new Employee("John","Support",35000,"Bangalore"));
          
          tx.commit();
          session.close();
          factory.close();
          
          System.out.println("Data added successfully!");
	}

}
