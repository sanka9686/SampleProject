package com.SpringFrist.Model;

import java.util.List;
import javax.persistence.*;



@Entity
@Table(name="Department")
public class Department {
	 @Id
	 @Column(name="department_id")
     private int dId;
	 @Column(name="department_name")
     private String dName;
	 @Column(name="department_location")
     private String dLocation;
     
	 
	 @OneToMany(mappedBy="department" ,fetch = FetchType.EAGER, cascade=CascadeType.MERGE)
	 @Column(nullable=true)
     private List<Course> courses; 
	 
	 
     
	public Department(int dId, String dName, String dLocation) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dLocation = dLocation;
		
	}
	public Department() {
	
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getdLocation() {
		return dLocation;
	}
	public void setdLocation(String dLocation) { 
		this.dLocation = dLocation;
	}
	
	/*public List<Course> getCourses() {
		return courses;
	}*/
	public void setCourses(List<Course> course) {
		this.courses = course;
	}
     
     
     
}
