package com.crime_IMS.usecases;

import java.util.List;

import com.crime_IMS.Exception.CrimeException;
import com.crime_IMS.bean.CrimesBean;
import com.crime_IMS.dao.AdministrativePoliceDao;
import com.crime_IMS.dao.AdministrativePoliceDaoImpl;

public class getAllTheCaseByAdministrator {

	public static void main(String[] args) {
		AdministrativePoliceDao dao = new AdministrativePoliceDaoImpl();
		
		try {
			List<CrimesBean> crimes = dao.getAllTheCrimesCases();
			crimes.forEach(crime -> System.out.println(crime));
			
		} catch (CrimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
