package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CriteriaPagination {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
	    conf.configure("hibernate.cfg.xml");
	    
	    SessionFactory factory = conf.buildSessionFactory();
	    
	    Session session = factory.openSession();
	    
	    int pageNumber =2;
	    int pageSize=5;
	    Criteria c1 = session.createCriteria(Products.class);
	    
	    c1.setFirstResult((pageNumber-1)*pageSize);
	    c1.setMaxResults(pageSize);
	    
	    List<Products> list=c1.list();
	    System.out.println("******** Pagenumber:"+pageNumber+" ********");
	    for(Products p1:list) {
	    	System.out.println(p1.getProduct_id()+" "+p1.getProduct_name()+" "+p1.getPrice()+" "+p1.getQuantity());
	    }

	}

}
