package com.salih.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.salih.entity.Ogretmen;
import com.salih.entity.OgretmenDetay;


public class HibernateQuery2 {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = 
				new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(OgretmenDetay.class)
				.addAnnotatedClass(Ogretmen.class)
				.buildSessionFactory();
		
				//create session
				Session session = sessionFactory.getCurrentSession();
				
				OgretmenDetay ogrDty = new OgretmenDetay("Java","Football","abc.com","salihAlper");
				Ogretmen ogr =new Ogretmen(ogrDty, "Salih", "Alper","salihalper19942@gmail.com");
				
				session.beginTransaction();
				Ogretmen ogr2=session.get(Ogretmen.class,6 );
			//	session.save(ogrDty);
				session.delete(ogr2);
				
				session.getTransaction().commit();
				sessionFactory.close();
				
				
				
				
				
	}

}
