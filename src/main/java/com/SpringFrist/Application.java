package com.SpringFrist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.SpringFrist.Model.Course;
import com.SpringFrist.Model.Department;




@SpringBootApplication
public class Application {
 
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
     	
		Course c1 =new Course();
		c1.setcId("IN2300");
		c1.setcName("web");
		c1.setcLength("6 weeks");
		
		Department d1=new Department();
		d1.setdLocation("3rd floor,fit");
		d1.setdName("It department");
	}
	
	
	
}
