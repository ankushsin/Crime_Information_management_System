package com.crime_IMS.bean;

public class CrimesBean {
	
	private int crime_id;
	private String crime_area;
	private String c_police_stn;
	private boolean solved;
	private String crime_date;
	private String crime_place;
	private String crime_desc;
	private int victim_numbers;
	private String crime_detail_desc ;
	private String crime_main_suspect;
	
	public CrimesBean() {
		
	}
	
	
	public CrimesBean(int crime_id, String crime_area, String c_police_stn, boolean solved, String crime_date,
			String crime_place, String crime_desc, int victim_numbers, String crime_detail_desc,
			String crime_main_suspect) {
		super();
		this.crime_id = crime_id;
		this.crime_area = crime_area;
		this.c_police_stn = c_police_stn;
		this.solved = solved;
		this.crime_date = crime_date;
		this.crime_place = crime_place;
		this.crime_desc = crime_desc;
		this.victim_numbers = victim_numbers;
		this.crime_detail_desc = crime_detail_desc;
		this.crime_main_suspect = crime_main_suspect;
	}


	public int getCrime_id() {
		return crime_id;
	}


	public void setCrime_id(int crime_id) {
		this.crime_id = crime_id;
	}


	public String getCrime_area() {
		return crime_area;
	}


	public void setCrime_area(String crime_area) {
		this.crime_area = crime_area;
	}


	public String getC_police_stn() {
		return c_police_stn;
	}


	public void setC_police_stn(String c_police_stn) {
		this.c_police_stn = c_police_stn;
	}


	public boolean isSolved() {
		return solved;
	}


	public void setSolved(boolean solved) {
		this.solved = solved;
	}


	public String getCrime_date() {
		return crime_date;
	}


	public void setCrime_date(String crime_date) {
		this.crime_date = crime_date;
	}


	public String getCrime_place() {
		return crime_place;
	}


	public void setCrime_place(String crime_place) {
		this.crime_place = crime_place;
	}


	public String getCrime_desc() {
		return crime_desc;
	}


	public void setCrime_desc(String crime_desc) {
		this.crime_desc = crime_desc;
	}


	public int getVictim_numbers() {
		return victim_numbers;
	}


	public void setVictim_numbers(int victim_numbers) {
		this.victim_numbers = victim_numbers;
	}


	public String getCrime_detail_desc() {
		return crime_detail_desc;
	}


	public void setCrime_detail_desc(String crime_detail_desc) {
		this.crime_detail_desc = crime_detail_desc;
	}


	public String getCrime_main_suspect() {
		return crime_main_suspect;
	}


	public void setCrime_main_suspect(String crime_main_suspect) {
		this.crime_main_suspect = crime_main_suspect;
	}


	@Override
	public String toString() {
		return "CrimesBean [crime_id=" + crime_id + ", crime_area=" + crime_area + ", c_police_stn=" + c_police_stn
				+ ", solved=" + solved + ", crime_date=" + crime_date + ", crime_place=" + crime_place + ", crime_desc="
				+ crime_desc + ", victim_numbers=" + victim_numbers + ", crime_detail_desc=" + crime_detail_desc
				+ ", crime_main_suspect=" + crime_main_suspect + "]";
	}
	
	
	
	

}
