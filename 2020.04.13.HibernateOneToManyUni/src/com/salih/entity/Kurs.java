package com.salih.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="KURS")
public class Kurs {
		
	@Id
	@Column(name="ID")
	@SequenceGenerator(name="kurs_seq",sequenceName = "seq_kurs",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="kurs_seq")
	private int id;
	
	
	
	@Column(name="kurs_adi")
	private String kursAdi;
	
	@Column(name="saat")
	private int saat;
	
	@ManyToOne
	@JoinColumn(name="ogretmen_id")
	private Ogretmen ogretmen;
	
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="KURS_ID")
	private List<Konu> konular;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKursAdi() {
		return kursAdi;
	}

	public void setKursAdi(String kursAdi) {
		this.kursAdi = kursAdi;
	}

	public int getSaat() {
		return saat;
	}

	public void setSaat(int saat) {
		this.saat = saat;
	}
		
	

	public Ogretmen getOgretmen() {
		return ogretmen;
	}

	public void setOgretmen(Ogretmen ogretmen) {
		this.ogretmen = ogretmen;
	}

	public void addKonu(Konu konu) {
		if(konular==null)
			konular=new ArrayList<Konu>();
		konular.add(konu);
	}

	public List<Konu> getKonular() {
		return konular;
	}

	public Kurs(String kursAdi, int saat, Ogretmen ogretmen) {
		super();
	
		this.kursAdi = kursAdi;
		this.saat = saat;
		this.ogretmen = ogretmen;
	}

	
	public Kurs() {
		super();
	}

	@Override
	public String toString() {
		return kursAdi;
	}
	
	
}
