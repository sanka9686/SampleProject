package com.SpringFrist.Model;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;



@Entity
@Table(name="Student")
public class Student {
    @Id
    @Column(name="student_id")
	private String sId;
    @Column(name="student_name")
	private String sName;
    @Column(name="student_academicyear")
	private int sAcademicYear;

    @ManyToMany(cascade=CascadeType.MERGE)
	   @JoinTable(name="Student_Course",
	   joinColumns=@JoinColumn(name="Student_id"),
	   inverseJoinColumns= @JoinColumn(name="Course_id"))    
    private List<Course> courses=new ArrayList<Course>();
    
	public Student(){
		
	}
	public Student(String sId, String sName, int sAcademicYear) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAcademicYear = sAcademicYear;
		
	}
	
	 
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public  String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAcademicYear() {
		return sAcademicYear;
	}
	
	public void setsAcademicYear(int sAcademicYear) {
		this.sAcademicYear = sAcademicYear;
	}
	
	
	
}
