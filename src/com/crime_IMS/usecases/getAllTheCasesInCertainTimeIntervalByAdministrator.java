package com.crime_IMS.usecases;

import java.util.List;
import java.util.Scanner;

import com.crime_IMS.Exception.CrimeException;
import com.crime_IMS.bean.CrimesBean;
import com.crime_IMS.dao.AdministrativePoliceDao;
import com.crime_IMS.dao.AdministrativePoliceDaoImpl;

public class getAllTheCasesInCertainTimeIntervalByAdministrator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Start date of your interval in YYYY-MM-DD");
		String startdate = sc.nextLine();
		
		System.out.println("Enter The End date of your interval in YYYY-MM-DD");
		String enddate = sc.nextLine();
		
		AdministrativePoliceDao dao = new AdministrativePoliceDaoImpl();
		
		try {
			List<CrimesBean> crimes = dao.getAllTheCrimesCasesinCertaInTimeInterval(startdate, enddate);
			crimes.forEach(crime -> System.out.println(crime));
			
		} catch (CrimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
