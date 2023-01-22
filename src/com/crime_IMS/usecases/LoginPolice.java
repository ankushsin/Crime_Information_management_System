package com.crime_IMS.usecases;

import java.util.Scanner;

import com.crime_IMS.Exception.PoliceException;
import com.crime_IMS.bean.PoliceBean;
import com.crime_IMS.dao.PoliceDao;
import com.crime_IMS.dao.PoliceDaoImpl;

public class LoginPolice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String username = sc.next();

		System.out.println("Enter password: ");
		String password = sc.next();
		
		PoliceDao dao = new PoliceDaoImpl();
		
		try {
			PoliceBean police = dao.loginPolice(username, password);
			System.out.println("welcome "+ police.getPolice_name());
			
		} catch (PoliceException e) {
			System.out.println(e.getMessage());
		}

	}

}
