package com.salih.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="OGRENCI")
public class Ogrenci {
	
	@Id
	@Column(name="ID")
	@SequenceGenerator(name="ogrenci_seq",sequenceName = "seq_ogrenci",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="ogrenci_seq")
	private int id;
	
	@Column(name="ISIM")
	private String isim;
	
	@Column(name="SOYISIM")
	private String soyisim;
	
	@Column(name="OGRENCI_NO")
	private int ogrenciNo;
	
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(name="ogrenci_kurs",joinColumns = @JoinColumn(name="ogrenci_id"),inverseJoinColumns = @JoinColumn(name="kurs_id"))
	private List<Kurs> kurslar;
	
	public void addKurs(Kurs kurs) {
		if(kurslar==null)
			kurslar=new ArrayList<Kurs>();
		
		kurslar.add(kurs);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	public List<Kurs> getKurslar() {
		return kurslar;
	}

	public void setKurslar(List<Kurs> kurslar) {
		this.kurslar = kurslar;
	}

	public Ogrenci(String isim, String soyisim, int ogrenciNo) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.ogrenciNo = ogrenciNo;
		
	}

	public Ogrenci() {
		super();
	}
	
	

}
