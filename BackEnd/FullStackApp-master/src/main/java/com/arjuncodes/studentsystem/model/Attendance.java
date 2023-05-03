//package com.arjuncodes.studentsystem.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Attendance {
//	 @Id
//	    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	    private int id;    
//	    private int Bcode;
//	    private String Eid;
//	    private String Workingday;
//	    private String Intime;
//	    private String Outtime;
//	    private String Totalhour;
//	    private String Leaves;
//	   
//
//		public Attendance() {
//		}
//
//		public int getId() {
//			return id;
//		}
//
//		public void setId(int id) {
//			this.id = id;
//		}
//
//		public int getBcode() {
//			return Bcode;
//		}
//
//		public void setBcode(int bcode) {
//			Bcode = bcode;
//		}
//
//		public String getEid() {
//			return Eid;
//		}
//
//		public void setEid(String eid) {
//			Eid = eid;
//		}
//
//		public String getWorkingday() {
//			return Workingday;
//		}
//
//		public void setWorkingday(String workingday) {
//			Workingday = workingday;
//		}
//
//		public String getIntime() {
//			return Intime;
//		}
//
//		public void setIntime(String intime) {
//			Intime = intime;
//		}
//
//		public String getOuttime() {
//			return Outtime;
//		}
//
//		public void setOuttime(String outtime) {
//			Outtime = outtime;
//		}
//
//		public String getTotalhour() {
//			return Totalhour;
//		}
//
//		public void setTotalhour(String totalhour) {
//			Totalhour = totalhour;
//		}
//
//		public String getLeaves() {
//			return Leaves;
//		}
//
//		public void setLeaves(String leaves) {
//			Leaves = leaves;
//		}
//
//
//		
//	}
//	    