package com.salih.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.salih.entity.Departments;
import com.salih.entity.Jobs;

public class HibernateQuery {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = 
				new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Jobs.class)
				.addAnnotatedClass(Departments.class)
				.buildSessionFactory();
		
				//create session
				Session session = sessionFactory.getCurrentSession();
				session.beginTransaction();
				List<Departments> depts=session.createQuery("from Departments where locationId=1700").getResultList(); 
				
				for (Departments depart : depts) {
					System.out.println(depart.getDepartmentName());
				}
				
				session.getTransaction().commit();
				sessionFactory.close();
				
				
				
				
				
	}

}
