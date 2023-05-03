//package com.arjuncodes.studentsystem.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//
//public class Student {
//	 @Id
//	    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	    private int id;  
//	    private int receiptNumber;  
//	    private String bcode;
//	    private String eid;
//	    private String cldate;
//	    private String amount;
//	    private String tpettycash;
//	    private String transactionDate;
//	    
//	    public Student() {
//	  		}
//	    
//		public int getId() {
//			return id;
//		}
//		public void setId(int id) {
//			this.id = id;
//		}
//		public int getReceiptNumber() {
//			return receiptNumber;
//		}
//		public void setReceiptNumber(int receiptNumber) {
//			this.receiptNumber = receiptNumber;
//		}
//		public String getBcode() {
//			return bcode;
//		}
//		public void setBcode(String bcode) {
//			this.bcode = bcode;
//		}
//		public String getEid() {
//			return eid;
//		}
//		public void setEid(String eid) {
//			this.eid = eid;
//		}
//		public String getCldate() {
//			return cldate;
//		}
//		public void setCldate(String cldate) {
//			this.cldate = cldate;
//		}
//		public String getAmount() {
//			return amount;
//		}
//		public void setAmount(String amount) {
//			this.amount = amount;
//		}
//		public String getTpettycash() {
//			return tpettycash;
//		}
//		public void setTpettycash(String tpettycash) {
//			this.tpettycash = tpettycash;
//		}
//		public String getTransactionDate() {
//			return transactionDate;
//		}
//		public void setTransactionDate(String transactionDate) {
//			this.transactionDate = transactionDate;
//		}
//	    
//	
//	    
//		
//	}
//	    