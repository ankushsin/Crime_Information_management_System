package com.crime_IMS.usecases;

import java.util.List;

import com.crime_IMS.Exception.CrimeException;
import com.crime_IMS.bean.CrimesBean;
import com.crime_IMS.dao.PoliceDao;
import com.crime_IMS.dao.PoliceDaoImpl;

public class getAllTheCasesByPolice {

	public static void main(String[] args) {
		
		PoliceDao dao = new PoliceDaoImpl();
		
		try {
			List<CrimesBean> crimes = dao.getAllTheCrimesCases();
			crimes.forEach(crime -> System.out.println(crime));
			
		} catch (CrimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
