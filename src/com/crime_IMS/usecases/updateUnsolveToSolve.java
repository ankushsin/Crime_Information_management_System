package com.crime_IMS.usecases;

import java.util.Scanner;

import com.crime_IMS.Exception.CrimeException;
import com.crime_IMS.bean.CrimesBean;
import com.crime_IMS.bean.CriminalBean;
import com.crime_IMS.dao.AdministrativePoliceDao;
import com.crime_IMS.dao.AdministrativePoliceDaoImpl;

public class updateUnsolveToSolve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter main suspect name :-");
		String crime_main_suspect = sc.nextLine();
		
		System.out.println("Enter crime id in which the criminal is arrested");
		int crime_id = sc.nextInt();
		sc.nextLine();
		
		CrimesBean crime = new CrimesBean();
		crime.setCrime_main_suspect(crime_main_suspect);
		crime.setCrime_id(crime_id);
		
		AdministrativePoliceDao dao = new AdministrativePoliceDaoImpl();
		
		try {
			String result = dao.UpdateUnsolveToSolve(crime);
			System.out.println(result);
			
		} catch (CrimeException e) {
			System.out.println(e.getMessage());
		}

	}

}
