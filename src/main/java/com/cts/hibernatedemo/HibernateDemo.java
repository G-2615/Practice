package com.cts.hibernatedemo;



import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.cts.model.Product2;

public class HibernateDemo {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
	    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		//Storing value in database
	/*	Product2 prod = new Product2(1,"Fan",20 ,3000.9f);
		session.beginTransaction();
		Serializable serializable = session.save(prod);
		prod.setProdprice(5000.89f);
		session.getTransaction().commit();
		System.out.println(serializable); */
		
		//Getting Data from database                                
		Product2 proda = (Product2)session.get(Product2.class,1);
		System.out.println(proda);
		session.close();
		
		
			
	}

}
