package com.crime_IMS.main;

import java.util.Scanner;

import com.crime_IMS.usecases.RegisterNewCrimeByAdministrator;
import com.crime_IMS.usecases.RegisterNewCriminalByAdministrator;
import com.crime_IMS.usecases.RegisterNewPoliceByAdministrator;
import com.crime_IMS.usecases.getAllTheCaseByAdministrator;
import com.crime_IMS.usecases.getAllTheCasesInCertainTimeIntervalByAdministrator;

import com.crime_IMS.usecases.getSolvedClassByAdministrator;
import com.crime_IMS.usecases.getUnSolvedCasesByAdministrator;
import com.crime_IMS.usecases.updateUnsolveToSolve;

public class Administrator_police_Main {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Please Select the option numbers :-");
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		System.out.println("\n");
		System.out.println("1:-  Press 1 to see all the solved cases");
		System.out.println("2:-  Press 2 to see all the unsolved cases");
		System.out.println("3:-  Press 3 to update unsolve case to solve");
		System.out.println("4:-  Press 4 to see all the cases");
		System.out.println("5:-  Press 5 to register new crime");
		System.out.println("6:-  Press 6 to register new criminal");
		System.out.println("7:-  Press 7 to register new police");
		System.out.println("8:-  Press 8 to see all the cases between certain time intervals");
		System.out.println("9:-  Press 9 to logout");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num == 1) {
			getSolvedClassByAdministrator solve_cases_adm = new getSolvedClassByAdministrator();
			solve_cases_adm.main(args);
			System.out.println("\n");
			System.out.println("\n");

			Thread.sleep(1000);
			Administrator_police_Main mai = new Administrator_police_Main();
			mai.main(args);
			
		}else if(num ==2) {
			
			getUnSolvedCasesByAdministrator unsolve_case_adm = new getUnSolvedCasesByAdministrator();
			unsolve_case_adm.main(args);
			System.out.println("\n");
			System.out.println("\n");

			Thread.sleep(1000);
			Administrator_police_Main mai = new Administrator_police_Main();
			mai.main(args);
			
		}else if(num ==3) {
			
			updateUnsolveToSolve update_case_adm = new updateUnsolveToSolve();
			update_case_adm.main(args);
			System.out.println("\n");
			System.out.println("\n");
			Thread.sleep(1000);
			Administrator_police_Main mai = new Administrator_police_Main();
			mai.main(args);
		}else if(num == 4) {
			
			getAllTheCaseByAdministrator getallcase_adm = new getAllTheCaseByAdministrator();
			getallcase_adm.main(args);
			System.out.println("\n");
			System.out.println("\n");

			Thread.sleep(1000);
			Administrator_police_Main mai = new Administrator_police_Main();
			mai.main(args);
		}else if(num == 5) {
			
			RegisterNewCrimeByAdministrator reg_adm = new RegisterNewCrimeByAdministrator();
			 reg_adm.main(args);
			System.out.println("\n");
			System.out.println("\n");

			Thread.sleep(1000);
			Administrator_police_Main mai = new Administrator_police_Main();
			mai.main(args);
		}else if(num == 6) {
			
			RegisterNewCriminalByAdministrator reg_crim_adm = new RegisterNewCriminalByAdministrator();
			reg_crim_adm.main(args);
			System.out.println("\n");
			System.out.println("\n");

			Thread.sleep(1000);
			Administrator_police_Main mai = new Administrator_police_Main();
			mai.main(args);
		}else if(num == 7) {
			
			RegisterNewPoliceByAdministrator reg_pol_adm = new RegisterNewPoliceByAdministrator();
			reg_pol_adm.main(args);
			System.out.println("\n");
			System.out.println("\n");

			Thread.sleep(1000);
			Administrator_police_Main mai = new Administrator_police_Main();
			mai.main(args);
		}else if(num == 8) {
			
			getAllTheCasesInCertainTimeIntervalByAdministrator time_int_adm = new getAllTheCasesInCertainTimeIntervalByAdministrator();
			time_int_adm.main(args);
			System.out.println("\n");
			System.out.println("\n");

			Thread.sleep(1000);
			Administrator_police_Main mai = new Administrator_police_Main();
			mai.main(args);
		}else if(num == 9) {
			Demo exit = new Demo();
			exit.main(args);
			System.out.println("\n");
			System.out.println("\n");
		}
		

	}

}
