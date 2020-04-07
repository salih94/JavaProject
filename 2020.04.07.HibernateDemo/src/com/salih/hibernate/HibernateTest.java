package com.salih.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.salih.entity.Departments;
import com.salih.entity.Jobs;

public class HibernateTest {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = 
				new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Jobs.class)
				.addAnnotatedClass(Departments.class)
				.buildSessionFactory();
		
				//create session
				Session session = sessionFactory.getCurrentSession();
				
				//Jobs jobs = new Jobs("TEST2","TEST MÜHENDÝSÝ",3000,5000);
				
				Departments departments = new Departments("Digital Marketing",100,1800); 
				
				session.beginTransaction();
				
				//session.save(jobs);
				
				session.save(departments);
				
				session.getTransaction().commit();
				
				session.close();
				
				
	}

}
