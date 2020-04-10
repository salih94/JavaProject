package com.salih.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="OGRETMEN")
public class Ogretmen {
	 	
//	@SequenceGenerator(name="dept_seq", sequenceName = "DEPARTMENTS_SEQ", allocationSize=10)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="dept_seq")
	
	@Id
	@Column(name="id")
	@SequenceGenerator(name="ogretmen_seq",sequenceName = "seq_ogretmen",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="ogretmen_seq")
	private int Id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ogretmen_detay_id")
	private OgretmenDetay ogretmenDetay;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;

	public OgretmenDetay getOgretmenDetay() {
		return ogretmenDetay;
	}

	public void setOgretmenDetay(OgretmenDetay ogretmenDetay) {
		this.ogretmenDetay = ogretmenDetay;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ogretmen(OgretmenDetay ogretmenDetay, String firstName, String lastName, String email) {
		super();
		this.ogretmenDetay = ogretmenDetay;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Ogretmen() {
		super();
	}





	
	
	
}
