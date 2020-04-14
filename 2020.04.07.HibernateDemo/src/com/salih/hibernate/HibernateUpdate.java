package com.salih.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.salih.entity.Departments;
import com.salih.entity.Jobs;

public class HibernateUpdate {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = 
				new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Jobs.class)
				.addAnnotatedClass(Departments.class)
				.buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
				//create session
				/*
				session.beginTransaction();
				
				Departments dept=session.get(Departments.class,40);
			
				dept.setDepartmentName("Ýnsan Kaynaklarý");
				
				
				
				session.getTransaction().commit();
				*/
				
				session.beginTransaction();
				session.createQuery("update Departments set DepartmentName='Human Resource' where departmentId=40").executeUpdate();
				session.getTransaction().commit();
				session.close();
				
				
				
				
				
	}

}
