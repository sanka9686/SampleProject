package com.SpringFrist.Model;


import java.util.List;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIdentityReference;

@Entity
@Table(name="Course")
public class Course {
	@Id
	@Column(name="Course_id")
	private String  cId;
	
	@Column(name="Course_name")
	private String  cName;
	
	@Column(name="Course_Length")           // like 3 weeks,6 weeks
	private String  cLength;
	
	 @ManyToMany(cascade=CascadeType.ALL)
	   @JoinTable(name="Student_Course",
	   joinColumns=@JoinColumn(name="Course_id"),
	   inverseJoinColumns= @JoinColumn(name="Student_id"))
	private List<Student> students;
	
	@JsonIdentityReference
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="department_id" ,insertable=false , updatable=true)
	private Department department;
	
	public Course() {
		
	}
	
	public Course(String cId, String cName, String cLength ) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cLength = cLength;
		
	}
	
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public String getcId() {
		return cId;
	}
	public void setcId(String cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcLength() {
		return cLength;
	}
	public void setcLength(String cLength) {
		this.cLength = cLength;
	}
	
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
	

}
