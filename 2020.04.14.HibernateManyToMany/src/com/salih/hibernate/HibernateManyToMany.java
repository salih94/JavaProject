package com.salih.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.omg.CORBA.portable.ApplicationException;


import com.salih.entity.Kurs;
import com.salih.entity.Ogrenci;
import com.salih.entity.Ogretmen;
import com.salih.entity.OgretmenDetay;


public class HibernateManyToMany {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = 
				new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(OgretmenDetay.class)
				.addAnnotatedClass(Ogretmen.class)
				.addAnnotatedClass(Kurs.class)
				.addAnnotatedClass(Ogrenci.class)
				.buildSessionFactory();
		
				//create session
				Session session = sessionFactory.getCurrentSession();
				
				
		
				
				session.beginTransaction();
				
			
			//	Ogretmen ogr=session.get(Ogretmen.class,12);
			
			
				//��rencinin ald��� kurslar� listeleme
				Ogrenci ogrenci=session.get(Ogrenci.class,1);
		
				for(int i=0;i<ogrenci.getKurslar().size();i++) {
					System.out.println(ogrenci.getKurslar().get(i));
				}
			
				/*	
				//��renciye kurs Ekleme
				Kurs kurs=session.get(Kurs.class,12);
				
				ogrenci.addKurs(kurs);
				
				session.save(ogrenci);
					*/
				
				
				
				//Kursa ��renci Ekleme
				/*	Kurs kurs=session.get(Kurs.class,10);
				
				Ogrenci ogrenci1=new Ogrenci("Fatma","Alper",111);
				Ogrenci ogrenci2=new Ogrenci("Mustafa","�ulcu",112);
				
				kurs.addOgrenci(ogrenci1);
				kurs.addOgrenci(ogrenci2);
				
				session.save(kurs);*/
				
			
				session.getTransaction().commit();
				sessionFactory.close();
				
				
				
				
				
				
	}

}
