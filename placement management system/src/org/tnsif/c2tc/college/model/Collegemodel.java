package org.tnsif.c2tc.College.Model;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "college")
public class college {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "admin")
	private String admin;
	
	@Column(name = "college")
	private String college;
	

	
	@Column(name = "location")
	private String location;
	
	
	public College() {
	
	}
	
	
	public College(String admin, String college, String location,) {
		super();
		this.admin = admin;
		this.college = college;
		this.location = Location;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getadmin() {
		return admin;
	}
	public void setName(String admin) {
		this.admin = admin;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}package org.tnsif.c2tc.college.model;

public class Collegemodel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

