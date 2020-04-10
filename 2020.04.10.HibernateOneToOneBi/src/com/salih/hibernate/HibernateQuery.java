package com.salih.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.salih.entity.Ogretmen;
import com.salih.entity.OgretmenDetay;


public class HibernateQuery {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = 
				new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(OgretmenDetay.class)
				.addAnnotatedClass(Ogretmen.class)
				.buildSessionFactory();
		
				//create session
				Session session = sessionFactory.getCurrentSession();
				
				//OgretmenDetay ogrDty = new OgretmenDetay("Java","Football","abc.com","salihAlper");
				//Ogretmen ogr =new Ogretmen(ogrDty, "Salih", "Alper","salihalper19942@gmail.com");
				
				
				session.beginTransaction();
				
				OgretmenDetay ogrdt=session.get(OgretmenDetay.class, 7);
				//Ogretmen ogr=session.get(Ogretmen.class,ogrdt.getOgretmen().getId());
			
				//session.delete(ogrdt);
				//session.delete(ogr);
				
				//OgretmenDetay ogrdt=session.get(OgretmenDetay.class, 6);
				
			//	ogrdt.getOgretmen().setOgretmenDetay(null);
				session.delete(ogrdt);
				
			//	session.save(ogrDty);
			//	session.save(ogr);
				
				session.getTransaction().commit();
				sessionFactory.close();
				
				
				
				
				
				
	}

}
