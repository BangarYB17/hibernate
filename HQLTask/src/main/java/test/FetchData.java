package test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchData {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");

		SessionFactory factory = conf.buildSessionFactory();

		Session session = factory.openSession();

		// 1.Fetch All Employees
		/*
		  Query q = session.createQuery(" from Employee",Employee.class);
		  List<Employee> list =q.list(); 
		  for(Employee e1:list) {
		      System.out.println(e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getDepartment()
		  +" "+e1.getSalary()+" "+e1.getCity()); }
		 /

		// 2.Fetch All Employees
		/*
		  Query q =session.createQuery("select empName from Employee"); 
		  List<String>list = q.list(); 
		  for(String e1:list) { System.out.println(e1); }
		 */

		// 3.Fetch Employee by ID
		
		/*Query q = session.createQuery("from Employee where id=4", Employee.class);
		List<Employee> list = q.list();
		for (Employee e1 : list) {
			System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getDepartment() + " " + e1.getSalary()
					+ " " + e1.getCity());
		}*/

		// 4.Fetch Employees from IT Department
		
		/*Query q = session.createQuery("from Employee where department='IT'", Employee.class);
		List<Employee> list = q.list();
		for (Employee e1 : list) {
			System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getDepartment() + " " + e1.getSalary()
					+ " " + e1.getCity());
		}*/
		 

		// 5.Display Employees from Pune
		
		/*Query q = session.createQuery("from Employee where city='pune'", Employee.class);
		List<Employee> list = q.list();
		for (Employee e1 : list) {
			System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getDepartment() + " " + e1.getSalary()
					+ " " + e1.getCity());
		}*/
		 

		// 6.Employees Having Salary Greater Than 50000
		
		/*Query q = session.createQuery("from Employee where salary>50000", Employee.class);
		List<Employee> list = q.list();
		for (Employee e1 : list) {
			System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getDepartment() + " " + e1.getSalary()
					+ " " + e1.getCity());
		}*/
		 

		// 7.Employees Having Salary Less Than 50000
		
		/*Query q = session.createQuery("from Employee where salary<50000", Employee.class);
		List<Employee> list = q.list();
		for (Employee e1 : list) {
			System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getDepartment() + " " + e1.getSalary()
					+ " " + e1.getCity());
		}*/
		 

		// 8.Display Employee Names and Salary
		
		/*Query q = session.createQuery("select empName,salary from Employee");
		List<Object[]> list = q.list();
		for (Object[] e1 : list) {
			System.out.println(e1[0]+" "+e1[1]);
		}*/
		 

		// 9.sort Employees by Salary
		
		/*Query q = session.createQuery("from Employee order by salary asc", Employee.class);
		List<Employee> list = q.list();
		for (Employee e1 : list) {
			System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getDepartment() + " " + e1.getSalary()
					+ " " + e1.getCity());
		}*/

		// 10.Sort Employees by Name
		
		/*Query q = session.createQuery("from Employee order by empName asc", Employee.class);
		List<Employee> list = q.list();
		for (Employee e1 : list) {
			System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getDepartment() + " " + e1.getSalary()
					+ " " + e1.getCity());
		}*/
		 

		// 11.Count Total Employees
		
		/*Query q = session.createQuery("select count(*) from Employee");
		List<Long> list = q.list();
		for (Long e1 : list) {
			System.out.println(e1);
		}*/
		 

		// 12.Find Maximum Salary
		
		/*Query q = session.createQuery("select max(salary) from Employee");
		List<Double> list = q.list();
		for (Double e1 : list) {
			System.out.println(e1);
		}*/
		 

		// 13.Find Minimum Salary
		
		/*Query q = session.createQuery("select min(salary) from Employee");
		List<Double> list = q.list();
		for (Double e1 : list) {
			System.out.println(e1);
		}*/
		 

		// 14.Find Average Salary
		
		/*Query q = session.createQuery("select avg(salary) from Employee");
		List<Double> list = q.list();
		for (Double e1 : list) {
			System.out.println(e1);
		}*/
		 

		// 15.Display Unique Cities
		
		/*Query q = session.createQuery("select distinct(city) from Employee");
		List<String> list = q.list();
		for (String e1 : list) {
			System.out.println(e1);
		}*/

		// 16.Employees Name Starts with A
		
		/*Query q = session.createQuery("from Employee where empName like 'a%'", Employee.class);
		List<Employee> list = q.list();
		for (Employee e1 : list) {
			System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getDepartment() + " " + e1.getSalary()
					+ " " + e1.getCity());
		}*/

		// 17.Employees Working in IT or HR
		
		/*Query q = session.createQuery("from Employee where department in('IT','HR')", Employee.class);
		List<Employee> list = q.list();
		for (Employee e1 : list) {
			System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getDepartment() + " " + e1.getSalary()
					+ " " + e1.getCity());
		}*/

		// 18.Delete Employee where empid=5
		
		/*Transaction tx = session.beginTransaction();
		Query q = session.createQuery("delete from Employee where empId = 5");
		int result = q.executeUpdate();
		tx.commit();
		System.out.println(result + " record deleted");*/
		 

		// 19. Update Salary increment by 5000 where id =3
		/*Transaction tx = session.beginTransaction();
		Query q = session.createQuery("update Employee set salary = salary+5000 where empId = 3");
		int result = q.executeUpdate();
		tx.commit();
		System.out.println(result + " record updated");*/
		
		//20.Pagination:Display first 2 records.
		Query q=session.createQuery("from Employee ",Employee.class);
		q.setFirstResult(0);
		q.setMaxResults(2);
		List<Employee> list = q.list();
		for(Employee e1:list) {
			System.out.println(e1.getEmpId() + " " + e1.getEmpName() + " " + e1.getDepartment() + " " + e1.getSalary()
			+ " " + e1.getCity());
		}
 		

			
		
	}

}
