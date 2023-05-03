package com.arjuncodes.studentsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;    
	    private int Dept_id;
	    private String Dept_name;
	  
		public Department() {
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getDept_id() {
			return Dept_id;
		}

		public void setDept_id(int dept_id) {
			Dept_id = dept_id;
		}

		public String getDept_name() {
			return Dept_name;
		}

		public void setDept_name(String dept_name) {
			Dept_name = dept_name;
		}
		    
		
	}
	    