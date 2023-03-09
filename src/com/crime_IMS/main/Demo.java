package com.crime_IMS.main;

import java.util.Scanner;

import com.crime_IMS.Exception.PoliceException;
import com.crime_IMS.bean.AdministratorBean;
import com.crime_IMS.bean.PoliceBean;
import com.crime_IMS.dao.AdministrativePoliceDao;
import com.crime_IMS.dao.AdministrativePoliceDaoImpl;
import com.crime_IMS.dao.PoliceDao;
import com.crime_IMS.dao.PoliceDaoImpl;

public class Demo {

	public static void main(String[] args) {
		System.out.println("WELCOME TO CRIME INFORMATION MANAGEMENT SYSTEM");
		
		Scanner sce = new Scanner(System.in);
		System.out.println("Enter 1 for Administrator police Login");
		System.out.println("Enter 2 for Police Login");
		int num = sce.nextInt();
		if(num ==1) {
			System.out.println("Enter Username: ");
			String username = sce.next();

			System.out.println("Enter password: ");
			String password = sce.next();
			
			AdministrativePoliceDao daoo = new AdministrativePoliceDaoImpl();
			try {
                AdministratorBean admin = daoo.loginPolice(username, password);
				
				System.out.println("Welcome "+admin.getAdministrator_rank()+" "+admin.getAdministrator_name());
				System.out.println("\n");
				System.out.println("WELCOME TO ADMINISTRATOR POLICE SECTION :)");
				Administrator_police_Main adm_main = new Administrator_police_Main();
				adm_main.main(args);
				
			} catch (PoliceException e) {
				System.out.println(e.getMessage());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(num ==2) {
			
			
			System.out.println("Enter Username: ");
			String username = sce.next();

			System.out.println("Enter password: ");
			String password = sce.next();
			
			PoliceDao daoo = new PoliceDaoImpl();
			
			try {
				PoliceBean police = daoo.loginPolice(username, password);
				System.out.println("welcome "+ police.getPolice_name());
				System.out.println("\n");
				System.out.println("WELCOME TO POLICE SECTION :)");
				
				police_main pol_main = new police_main();
				pol_main.main(args);
				
				
			} catch (PoliceException e) {
				System.out.println(e.getMessage());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(num !=1 && num!=2) {
			System.out.println("You have entered the wrong input kindly enter the correct input");
			System.out.println("\n");
			System.out.println("\n");
			
			Demo demo_main = new Demo();
			demo_main.main(args);
		}

	}

}
