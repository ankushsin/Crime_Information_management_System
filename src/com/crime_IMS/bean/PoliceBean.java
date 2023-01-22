package com.crime_IMS.bean;

public class PoliceBean {
	
	private int police_id;
    private String police_name;
    private String police_gender;
	private int police_age;
	private String police_curr_police_stn;
	private String police_id_password;
	
	public PoliceBean(int police_id, String police_name, String police_gender, int police_age,
			String police_curr_police_stn, String police_id_password) {
		super();
		this.police_id = police_id;
		this.police_name = police_name;
		this.police_gender = police_gender;
		this.police_age = police_age;
		this.police_curr_police_stn = police_curr_police_stn;
		this.police_id_password = police_id_password;
	}

	public PoliceBean() {
		
	}

	public int getPolice_id() {
		return police_id;
	}

	public void setPolice_id(int police_id) {
		this.police_id = police_id;
	}

	public String getPolice_name() {
		return police_name;
	}

	public void setPolice_name(String police_name) {
		this.police_name = police_name;
	}

	public String getPolice_gender() {
		return police_gender;
	}

	public void setPolice_gender(String police_gender) {
		this.police_gender = police_gender;
	}

	public int getPolice_age() {
		return police_age;
	}

	public void setPolice_age(int police_age) {
		this.police_age = police_age;
	}

	public String getPolice_curr_police_stn() {
		return police_curr_police_stn;
	}

	public void setPolice_curr_police_stn(String police_curr_police_stn) {
		this.police_curr_police_stn = police_curr_police_stn;
	}

	public String getPolice_id_password() {
		return police_id_password;
	}

	public void setPolice_id_password(String police_id_password) {
		this.police_id_password = police_id_password;
	}

	@Override
	public String toString() {
		return "PoliceBean [police_id=" + police_id + ", police_name=" + police_name + ", police_gender="
				+ police_gender + ", police_age=" + police_age + ", police_curr_police_stn=" + police_curr_police_stn
				+ ", police_id_password=" + police_id_password + "]";
	}

	
	

}
