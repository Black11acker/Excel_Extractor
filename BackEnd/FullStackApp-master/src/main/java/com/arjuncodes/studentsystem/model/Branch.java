package com.arjuncodes.studentsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Branch {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;    
	    private int Bcode;
	    private String BName;
	    private String Dateofopening;
	    private String Status;
	    
		public Branch() {
		}
		    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getBcode() {
			return Bcode;
		}
		public void setBcode(int bcode) {
			Bcode = bcode;
		}
		public String getBName() {
			return BName;
		}
		public void setBName(String bName) {
			BName = bName;
		}
		public String getDateofopening() {
			return Dateofopening;
		}
		public void setDateofopening(String dateofopening) {
			Dateofopening = dateofopening;
		}
		public String getStatus() {
			return Status;
		}
		public void setStatus(String status) {
			Status = status;
		}
	  
		
	    
	}
	    