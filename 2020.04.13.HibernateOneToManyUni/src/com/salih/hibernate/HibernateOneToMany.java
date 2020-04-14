package com.salih.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.omg.CORBA.portable.ApplicationException;

import com.salih.entity.Konu;
import com.salih.entity.Kurs;
import com.salih.entity.Ogretmen;
import com.salih.entity.OgretmenDetay;


public class HibernateOneToMany {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = 
				new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(OgretmenDetay.class)
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(Kurs.class)
				.addAnnotatedClass(Konu.class)
				.buildSessionFactory();
		
				//create session
				Session session = sessionFactory.getCurrentSession();
				
				
		
				
				session.beginTransaction();
				
			
				Ogretmen ogr=session.get(Ogretmen.class,12);
			
			
			for(int i=0;i<ogr.getKurslar().size();i++) {
				System.out.println(ogr.getKurslar().get(i));
				for(int k=0;k<ogr.getKurslar().get(i).getKonular().size();k++) {
					System.out.println("  -"+ogr.getKurslar().get(i).getKonular().get(k));
				}
			}
				
		
				
			
				session.getTransaction().commit();
				sessionFactory.close();
				
				
				
				
				
				
	}

}
