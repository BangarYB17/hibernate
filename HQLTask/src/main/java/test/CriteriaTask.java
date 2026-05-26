package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaTask {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		// 1.Fetch All Employees
		
		/*Criteria c1 = session.createCriteria(Employee.class);
		List<Employee> list = c1.list();
		for(Employee e1:list) {
			System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getDepartment()+" "
		      +e1.getSalary()+" "+e1.getCity());
		}*/
		
		//2.Display Only Employee Names
		
		/*Criteria c1 = session.createCriteria(Employee.class);
		c1.setProjection(Projections.property("empName"));
		List<String> list =c1.list();
		for(String s1:list) {
			System.out.println(s1);
		}*/
		
		//3.Fetch Employee by ID
		
		/*Criteria c1=session.createCriteria(Employee.class);
		c1.add(Restrictions.eq("empId", 1));
		List<Employee> list =c1.list();
		for(Employee e1:list) {
			System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getDepartment()+" "
				      +e1.getSalary()+" "+e1.getCity());
		}*/
		
		//4.Fetch Employees from IT Department
		/*Criteria c1=session.createCriteria(Employee.class);
		c1.add(Restrictions.eq("department", "IT"));
		List<Employee> list =c1.list();
		for(Employee e1:list) {
			System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getDepartment()+" "
				      +e1.getSalary()+" "+e1.getCity());
		}*/
		
		//5.Display Employees from Pune
		/*Criteria c1=session.createCriteria(Employee.class);
		c1.add(Restrictions.eq("city", "pune"));
		List<Employee> list =c1.list();
		for(Employee e1:list) {
			System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getDepartment()+" "
				      +e1.getSalary()+" "+e1.getCity());
		}*/
		
		//6.Employees Having Salary Greater Than 50000
		/*Criteria c1=session.createCriteria(Employee.class);
		c1.add(Restrictions.gt("salary", 50000.00));
		List<Employee> list =c1.list();
		for(Employee e1:list) {
			System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getDepartment()+" "
				      +e1.getSalary()+" "+e1.getCity());
		}*/
		
		//7.Employees Having Salary Less Than 50000
		/*Criteria c1=session.createCriteria(Employee.class);
		c1.add(Restrictions.lt("salary", 50000.00));
		List<Employee> list =c1.list();
		for(Employee e1:list) {
			System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getDepartment()+" "
				      +e1.getSalary()+" "+e1.getCity());
		}*/
		
		//8.Display Employee Names and Salary
		/*Criteria c1 =session.createCriteria(Employee.class);
		ProjectionList p =Projections.projectionList();
		p.add(Projections.property("empName"));
		p.add(Projections.property("salary"));
		c1.setProjection(p);
		List<Object[]> list=c1.list();
		for(Object[] e1:list) {
			System.out.println(e1[0]+" "+e1[1]);
		}*/
		
		//9.Sort Employees by Salary
		/*Criteria c1 = session.createCriteria(Employee.class);
		c1.addOrder(Order.asc("salary"));
		List<Employee> list=c1.list();
		for(Employee e1:list) {
			System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getDepartment()+" "
				      +e1.getSalary()+" "+e1.getCity());
		}*/
		
		//10.Sort Employees by Name
		/*Criteria c1 = session.createCriteria(Employee.class);
		c1.addOrder(Order.asc("empName"));
		List<Employee> list=c1.list();
		for(Employee e1:list) {
			System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getDepartment()+" "
				      +e1.getSalary()+" "+e1.getCity());
		}*/
		
		//11.Count Total Employees
		/*Criteria c1 = session.createCriteria(Employee.class);
		c1.setProjection(Projections.rowCount());
		List<Long> list=c1.list();
		for(Long e1:list) {
			System.out.println(e1);
		}*/
		
		//12.Find Maximum Salary
		/*Criteria c1 =session.createCriteria(Employee.class);
		c1.setProjection(Projections.max("salary"));
		List<Double> list = c1.list();
		for(Double e1:list) {
			System.out.println(e1);
		}*/
		
		//13.Find Minimum Salary
		/*Criteria c1 =session.createCriteria(Employee.class);
		c1.setProjection(Projections.min("salary"));
		List<Double> list = c1.list();
		for(Double e1:list) {
			System.out.println(e1);
		}*/
		
		//14.Find Average Salary
		/*Criteria c1 =session.createCriteria(Employee.class);
		c1.setProjection(Projections.avg("salary"));
		List<Double> list = c1.list();
		for(Double e1:list) {
			System.out.println(e1);
		}*/
		
		//15.Display Unique Cities
		/*Criteria c1 =session.createCriteria(Employee.class);
		c1.setProjection(Projections.distinct(Projections.property("city")));
		List<String> list =c1.list();
		for(String e1:list) {
			System.out.println(e1);
		}*/
		
		//16.Employees Name Starts with A
		/*Criteria c1 =session.createCriteria(Employee.class);
		c1.add(Restrictions.like("empName", "a%"));
		List<Employee> list=c1.list();
		for(Employee e1:list) {
			System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getDepartment()+" "
				      +e1.getSalary()+" "+e1.getCity());
		}*/
		
		//17.Employees Working in IT or HR
		/*Criteria c1 =session.createCriteria(Employee.class);
		c1.add(Restrictions.or(Restrictions.eq("department", "IT"),Restrictions.eq("department", "HR")));
		List<Employee> list=c1.list();
		for(Employee e1:list) {
			System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getDepartment()+" "
				      +e1.getSalary()+" "+e1.getCity());
		}*/
		
		//18.Delete Employee
		/*Transaction tx = session.beginTransaction();
		Criteria c1 =session.createCriteria(Employee.class);
		c1.add(Restrictions.eq("id", 4));
		Employee e1 =(Employee) c1.uniqueResult();
		
		if(e1 !=null) {
			session.delete(e1);
			System.out.println("Employee delete successfully");
			tx.commit();
		}else {
			System.out.println("Employee Not Found");
		}
		
		session.close();
		factory.close();*/
		
		//19.update salary
		Transaction tx = session.beginTransaction();
		Criteria c1 =session.createCriteria(Employee.class);
		c1.add(Restrictions.eq("id", 3));
		Employee e1 =(Employee) c1.uniqueResult();
		
		if(e1 !=null) {
			double oldSal=e1.getSalary();
			e1.setSalary(oldSal+5000);
			session.update(e1);
			System.out.println(" Old salary: "+oldSal);
			System.out.println(" updated new salary: "+e1.getSalary());
			tx.commit();
		}else {
			System.out.println("Record Not Found");
		}
		
		session.close();
		factory.close();
		
	}

}
