package com.crime_IMS.usecases;

import java.util.Scanner;

import com.crime_IMS.Exception.CrimeException;
import com.crime_IMS.bean.CrimesBean;
import com.crime_IMS.dao.AdministrativePoliceDao;
import com.crime_IMS.dao.AdministrativePoliceDaoImpl;

public class RegisterNewCrimeByAdministrator {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Crime id");
		int crime_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name of Area Where Crime occured");
		String crime_area = sc.nextLine();
		
		System.out.println("Enter the police station near from where crime occurred");
		String c_police_stn = sc.nextLine();
		
		System.out.println("Crime solved or not");
		Boolean solved = sc.nextBoolean();
		sc.nextLine();
		
		System.out.println("Enter the date of the crime occurence");
		String crime_date = sc.nextLine();
		
		System.out.println("Enter the place where crime occurs");
		String crime_place = sc.nextLine();
		
		System.out.println("Enter the description of crime");
		String crime_desc = sc.nextLine();
		
		System.out.println("Enter the number of victims that were happen on crime");
		int victim_numbers = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the detail description of crime");
		String crime_detail_desc = sc.nextLine();
		
		System.out.println("Enter the main suspect name of crime if not null");
		String crime_main_suspect = sc.nextLine();
		
		CrimesBean crime = new CrimesBean();
		crime.setCrime_id(crime_id);
		crime.setC_police_stn(c_police_stn);
		crime.setSolved(solved);
		crime.setCrime_date(crime_date);
		crime.setCrime_place(crime_place);
		crime.setCrime_desc(crime_desc);
		crime.setVictim_numbers(victim_numbers);
		crime.setCrime_detail_desc(crime_detail_desc);
		crime.setCrime_main_suspect(crime_main_suspect);
		
		AdministrativePoliceDao dao = new AdministrativePoliceDaoImpl();
		try {
			String result = dao.RegisterNewCrime(crime);
			System.out.println(result);
			
		} catch (CrimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
