package com.crime_IMS.bean;

public class AdministratorBean {
	private int Administrator_id;
	private String Administrator_name;
	private String Administrator_password;
	private String Administrator_rank;
	
	public AdministratorBean() {
		
	}

	public AdministratorBean(int administrator_id, String administrator_name, String administrator_password,
			String administrator_rank) {
		super();
		Administrator_id = administrator_id;
		Administrator_name = administrator_name;
		Administrator_password = administrator_password;
		Administrator_rank = administrator_rank;
	}

	public int getAdministrator_id() {
		return Administrator_id;
	}

	public void setAdministrator_id(int administrator_id) {
		Administrator_id = administrator_id;
	}

	public String getAdministrator_name() {
		return Administrator_name;
	}

	public void setAdministrator_name(String administrator_name) {
		Administrator_name = administrator_name;
	}

	public String getAdministrator_password() {
		return Administrator_password;
	}

	public void setAdministrator_password(String administrator_password) {
		Administrator_password = administrator_password;
	}

	public String getAdministrator_rank() {
		return Administrator_rank;
	}

	public void setAdministrator_rank(String administrator_rank) {
		Administrator_rank = administrator_rank;
	}

	@Override
	public String toString() {
		return "AdministratorBean [Administrator_id=" + Administrator_id + ", Administrator_name=" + Administrator_name
				+ ", Administrator_password=" + Administrator_password + ", Administrator_rank=" + Administrator_rank
				+ "]";
	}
	
	

}
