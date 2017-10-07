package com.cg.student.bean;

public class StudentInfo {

	private int studId;
	private String studName;
	private String age;
	private String country;
	private String gender;
	private String centum;
	private String attempts;
	private String total;
	
	
	public StudentInfo(int studId, String studName, String age, String country,
			String gender, String centum, String attempts, String total) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.age = age;
		this.country = country;
		this.gender = gender;
		this.centum = centum;
		this.attempts = attempts;
		this.total = total;
	}
	
	
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}


	public int getStudId() {
		return studId;
	}


	public void setStudId(int studId) {
		this.studId = studId;
	}


	public String getStudName() {
		return studName;
	}


	public void setStudName(String studName) {
		this.studName = studName;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCentum() {
		return centum;
	}


	public void setCentum(String centum) {
		this.centum = centum;
	}


	public String getAttempts() {
		return attempts;
	}


	public void setAttempts(String attempts) {
		this.attempts = attempts;
	}


	public String getTotal() {
		return total;
	}


	public void setTotal(String total) {
		this.total = total;
	}


	
	
	
}
