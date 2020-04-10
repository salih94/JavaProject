package com.salih.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
				.buildSessionFactory();
		
				//create session
				Session session = sessionFactory.getCurrentSession();
				
				Ogretmen ogr=new Ogretmen(null, "Veli","Can", "velican@gmail");
				
				ogr.addKurs(new Kurs ("Java",600,ogr));
				ogr.addKurs(new Kurs("Database",500,null));
				ogr.addKurs(new Kurs("JavaScript",400,null));
				
			
				
				
				session.beginTransaction();
				
				//Ogretmen ogr=session.get(Ogretmen.class,9);
				
			/*	for(int i=0;i<ogr.getKurslar().size();i++)
				{
					System.out.println(ogr.getKurslar().get(i));
					
				}*/
			//	Kurs kurs=session.get(Kurs.class,ogr.getKurslar().get(0).getId());
				//Kurs kurs2=session.get(Kurs.class,ogr.getKurslar().get(1).getId());
				
			//	ogr.getKurslar().remove(0);
				
				
			//	session.remove(kurs);
				session.save(ogr);
				//session.delete(kurs);
				//kurs2.setKursAdi("c#");
				//session.save(ogr);
			
				session.getTransaction().commit();
				sessionFactory.close();
				
				
				
				
				
				
	}

}
