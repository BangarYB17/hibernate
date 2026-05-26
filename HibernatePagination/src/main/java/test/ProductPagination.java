package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductPagination {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		int pageNumber = 3;
		int pageSize = 5;
		Query q = session.createQuery("from Products",Products.class);
		
		q.setFirstResult((pageNumber-1)*pageSize);
		q.setMaxResults(pageSize);
		
		List<Products> list=q.list();
		System.out.println("******** Pagenumber:"+pageNumber+" ********");
		for(Products p1:list){
			System.out.println(p1.getProduct_id()+" "+p1.getProduct_name()+" "+p1.getPrice()+" "+p1.getQuantity());
		}
		
	}

}
