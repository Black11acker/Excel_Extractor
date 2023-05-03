package com.arjuncodes.studentsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;  
	 
	    private String empname;  
	    private String Eid;
	    private String Dept_id;
	    private String DOB;
	    private String Mobile;
	    private String Email;
	    private String Role;
	    private String DOJ;
	    private String Bcode;
	    private int Age; 
	    
	    public Employee() {
  		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEmpname() {
			return empname;
		}

		public void setEmpname(String empname) {
			this.empname = empname;
		}

		public String getEid() {
			return Eid;
		}

		public void setEid(String eid) {
			Eid = eid;
		}

		public String getDept_id() {
			return Dept_id;
		}

		public void setDept_id(String dept_id) {
			Dept_id = dept_id;
		}

		public String getDOB() {
			return DOB;
		}

		public void setDOB(String dOB) {
			DOB = dOB;
		}

		public String getMobile() {
			return Mobile;
		}

		public void setMobile(String mobile) {
			Mobile = mobile;
		}

		public String getEmail() {
			return Email;
		}

		public void setEmail(String email) {
			Email = email;
		}

		public String getRole() {
			return Role;
		}

		public void setRole(String role) {
			Role = role;
		}

		public String getDOJ() {
			return DOJ;
		}

		public void setDOJ(String dOJ) {
			DOJ = dOJ;
		}

		public String getBcode() {
			return Bcode;
		}

		public void setBcode(String bcode) {
			Bcode = bcode;
		}

		public int getAge() {
			return Age;
		}

		public void setAge(int age) {
			Age = age;
		}

		
		
	}
	    