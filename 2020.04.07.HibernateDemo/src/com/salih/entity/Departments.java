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
	 	
//	@SequenceGenerator(name="dept_seq", sequenceName = "DEPARTMENTS_SEQ", allocationSize=10)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="dept_seq")
	
	@Id
	@Column(name="department_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	
	@Column(name="department_name")
	private String DepartmentName;
	
	@Column(name="manager_id")
	private Integer managerId;
	
	@Column(name="location_id")
	private Integer locationId;

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

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public Departments(String departmentName, Integer managerId, Integer locationId) {
		super();
		this.DepartmentName = departmentName;
		this.managerId = managerId;
		this.locationId = locationId;
	}

	public Departments() {
		super();
	}

	
	
	
}
