package com.crime_IMS.usecases;

import java.util.Scanner;

import com.crime_IMS.Exception.PoliceException;
import com.crime_IMS.bean.AdministratorBean;
import com.crime_IMS.dao.AdministrativePoliceDao;
import com.crime_IMS.dao.AdministrativePoliceDaoImpl;

public class LoginAdministrator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String username = sc.next();

		System.out.println("Enter password: ");
		String password = sc.next();
		
		AdministrativePoliceDao dao = new AdministrativePoliceDaoImpl();
		
		try {
			AdministratorBean admin = dao.loginPolice(username, password);
			
			System.out.println("Welcome "+admin.getAdministrator_rank()+" "+admin.getAdministrator_name());
		} catch (PoliceException e) {
			System.out.println(e.getMessage());
		}

	}

}
