package com.salih.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTMENTS")
public class Departments {
	 	
	@Id
	@Column(name="department_id")
	@SequenceGenerator(name="dept_seq", sequenceName = "DEPARTMENTS_SEQ", allocationSize=10)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="dept_seq")
	private int departmentId;
	
	@Column(name="department_name")
	private String DepartmentName;
	
	@Column(name="manager_id")
	private int managerId;
	
	@Column(name="location_id")
	private int locationId;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public Departments(String departmentName, int managerId, int locationId) {
		super();
		this.DepartmentName = departmentName;
		this.managerId = managerId;
		this.locationId = locationId;
	}

	
	
	
}
