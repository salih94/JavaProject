package com.salih.entity;

import javax.persistence.*;

@Entity
@Table(name="KONU")
public class Konu {

	@Id
	@Column(name="ID")
	@SequenceGenerator(name="konu_seq",sequenceName = "seq_konu",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="konu_seq")
	private int id;
	
	@Column(name="KONU_BASLIGI")
	private String konuBasligi;
	
	@Column(name="KONU_DETAYI")
	private String konuDetay;

	public String getKonuBasligi() {
		return konuBasligi;
	}

	public void setKonuBasligi(String konuBasligi) {
		this.konuBasligi = konuBasligi;
	}

	public String getKonuDetay() {
		return konuDetay;
	}

	public void setKonuDetay(String konuDetay) {
		this.konuDetay = konuDetay;
	}

	public int getId() {
		return id;
	}

	public Konu(String konuBasligi, String konuDetay) {
		super();
		this.konuBasligi = konuBasligi;
		this.konuDetay = konuDetay;
	}

	public Konu() {
		super();
	}

	@Override
	public String toString() {
		return "Konu Baþlýðý :" + konuBasligi + ", Konu Detayý :" + konuDetay;
	}
	

	
}
