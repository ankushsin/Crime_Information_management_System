package com.crime_IMS.usecases;

import java.util.Scanner;

import com.crime_IMS.Exception.CriminalException;
import com.crime_IMS.bean.CriminalBean;
import com.crime_IMS.dao.AdministrativePoliceDao;
import com.crime_IMS.dao.AdministrativePoliceDaoImpl;

public class RegisterNewCriminalByAdministrator {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Criminal id");
		int criminal_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Criminal name");
		String criminal_name = sc.nextLine();
		
		System.out.println("Enter the age of that criminal");
		int criminal_age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the adress of that criminal");
		String criminal_address = sc.nextLine();
		
		System.out.println("Enter the identify mark of that criminal");
		String criminal_identify_mark = sc.nextLine();
		
		System.out.println("Enter the area of arrest of that particular criminal");
		String criminal_area_of_arrest = sc.nextLine();
		
		System.out.println("Enter the crime id in which that criminal is arrested");
		int criminal_crime_id = sc.nextInt();
		sc.nextLine();
		
		
		CriminalBean criminal = new CriminalBean();
		
		criminal.setCriminal_id(criminal_id);
		criminal.setCriminal_name(criminal_name);
		criminal.setCriminal_age(criminal_age);
		criminal.setCriminal_address(criminal_address);
		criminal.setCriminal_identify_mark(criminal_identify_mark);
		criminal.setCriminal_area_of_arrest(criminal_area_of_arrest);
		criminal.setCriminal_crime_id(criminal_crime_id);
		
		AdministrativePoliceDao dao = new AdministrativePoliceDaoImpl();
		try {
			String result = dao.RegisterNewCriminal(criminal);
			System.out.println(result);
			
		} catch (CriminalException e) {
			System.out.println(e.getMessage());
		}

	}

}
