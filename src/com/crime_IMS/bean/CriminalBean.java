package com.crime_IMS.bean;

public class CriminalBean {
	
	
	private int criminal_id;
	private String criminal_name;
	private int criminal_age;
	private String criminal_gender;
	private String criminal_address;
	private String criminal_identify_mark ;
	private String criminal_area_of_arrest;
	private int criminal_crime_id ;
	
	
	
	public CriminalBean() {
		
	}



	public CriminalBean(int criminal_id, String criminal_name, int criminal_age, String criminal_gender,
			String criminal_address, String criminal_identify_mark, String criminal_area_of_arrest,
			int criminal_crime_id) {
		super();
		this.criminal_id = criminal_id;
		this.criminal_name = criminal_name;
		this.criminal_age = criminal_age;
		this.criminal_gender = criminal_gender;
		this.criminal_address = criminal_address;
		this.criminal_identify_mark = criminal_identify_mark;
		this.criminal_area_of_arrest = criminal_area_of_arrest;
		this.criminal_crime_id = criminal_crime_id;
	}



	public int getCriminal_id() {
		return criminal_id;
	}



	public void setCriminal_id(int criminal_id) {
		this.criminal_id = criminal_id;
	}



	public String getCriminal_name() {
		return criminal_name;
	}



	public void setCriminal_name(String criminal_name) {
		this.criminal_name = criminal_name;
	}



	public int getCriminal_age() {
		return criminal_age;
	}



	public void setCriminal_age(int criminal_age) {
		this.criminal_age = criminal_age;
	}



	public String getCriminal_gender() {
		return criminal_gender;
	}



	public void setCriminal_gender(String criminal_gender) {
		this.criminal_gender = criminal_gender;
	}



	public String getCriminal_address() {
		return criminal_address;
	}



	public void setCriminal_address(String criminal_address) {
		this.criminal_address = criminal_address;
	}



	public String getCriminal_identify_mark() {
		return criminal_identify_mark;
	}



	public void setCriminal_identify_mark(String criminal_identify_mark) {
		this.criminal_identify_mark = criminal_identify_mark;
	}



	public String getCriminal_area_of_arrest() {
		return criminal_area_of_arrest;
	}



	public void setCriminal_area_of_arrest(String criminal_area_of_arrest) {
		this.criminal_area_of_arrest = criminal_area_of_arrest;
	}



	public int getCriminal_crime_id() {
		return criminal_crime_id;
	}



	public void setCriminal_crime_id(int criminal_crime_id) {
		this.criminal_crime_id = criminal_crime_id;
	}



	@Override
	public String toString() {
		return "CriminalBean [criminal_id=" + criminal_id + ", criminal_name=" + criminal_name + ", criminal_age="
				+ criminal_age + ", criminal_gender=" + criminal_gender + ", criminal_address=" + criminal_address
				+ ", criminal_identify_mark=" + criminal_identify_mark + ", criminal_area_of_arrest="
				+ criminal_area_of_arrest + ", criminal_crime_id=" + criminal_crime_id + "]";
	}
	
	

}
