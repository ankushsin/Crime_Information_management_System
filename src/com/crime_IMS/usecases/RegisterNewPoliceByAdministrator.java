package com.crime_IMS.usecases;

import java.util.Scanner;

import com.crime_IMS.Exception.PoliceException;
import com.crime_IMS.bean.PoliceBean;
import com.crime_IMS.dao.AdministrativePoliceDao;
import com.crime_IMS.dao.AdministrativePoliceDaoImpl;

public class RegisterNewPoliceByAdministrator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the police id whom you wanna add in database");
		int police_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter police officer name");
		String police_name  = sc.nextLine();
		
		System.out.println("Enter gender of the officer");
		String police_gender = sc.nextLine();
		
		System.out.println("Enter the age of police officer");
		int police_age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the station in which the officer is rolled in");
		String police_curr_police_stn = sc.nextLine();
		
		System.out.println("Enter password of his id");
		String police_id_password = sc.nextLine();
		
		PoliceBean police = new PoliceBean();
		police.setPolice_id(police_id);
		police.setPolice_name(police_name);
		police.setPolice_gender(police_gender);
		police.setPolice_age(police_age);
		police.setPolice_curr_police_stn(police_curr_police_stn);
		police.setPolice_id_password(police_id_password);
		
		AdministrativePoliceDao dao = new AdministrativePoliceDaoImpl();
		
		
		
		try {
			String result = dao.RegisterNewPolice(police);
			System.out.println(result);
		} catch (PoliceException e) {
			System.out.println(e.getMessage());
		}

	}

}
