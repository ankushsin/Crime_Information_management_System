package com.crime_IMS.main;

import java.util.Scanner;

import com.crime_IMS.usecases.RegisterNewCrimeByPolice;
import com.crime_IMS.usecases.RegisterNewCriminalByPolice;
import com.crime_IMS.usecases.getAllTheCasesByPolice;
import com.crime_IMS.usecases.getAllTheCasesInCertainTimeIntervalbyPolice;
import com.crime_IMS.usecases.getSolvedCaseByPolice;
import com.crime_IMS.usecases.getUnsolvedCasesByPolice;

public class police_main {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Please Select the option numbers :-");
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		System.out.println("\n");
		System.out.println("1:-  Press 1 to see all the solved cases");
		System.out.println("2:-  Press 2 to see all the unsolved cases");
		System.out.println("3:-  Press 3 to see all the cases");
		System.out.println("4:-  Press 4 to register new crime");
		System.out.println("5:-  Press 5 to register new criminal");
		System.out.println("6:-  Press 6 to see all the cases between certain time intervals");
		System.out.println("7:-  Press 7 to logout");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num == 1) {
			getSolvedCaseByPolice solve_case_police = new getSolvedCaseByPolice();
			solve_case_police.main(args);
			System.out.println("\n");
			System.out.println("\n");
			
			Thread.sleep(1000);
			police_main pm = new police_main();
			pm.main(args);
			
		}else if(num == 2) {
			
			getUnsolvedCasesByPolice unsolve_case_police = new getUnsolvedCasesByPolice();
			unsolve_case_police.main(args);
			System.out.println("\n");
			System.out.println("\n");
			
			Thread.sleep(1000);
			police_main pm = new police_main();
			pm.main(args);
		}else if(num == 3) {
			
			getAllTheCasesByPolice get_all_pol = new getAllTheCasesByPolice();
			get_all_pol.main(args);
			System.out.println("\n");
			System.out.println("\n");
			
			Thread.sleep(1000);
			police_main pm = new police_main();
			pm.main(args);
			
		}else if(num == 4) {
			
			RegisterNewCrimeByPolice reg_crime_pol = new RegisterNewCrimeByPolice();
			reg_crime_pol.main(args);
			System.out.println("\n");
			System.out.println("\n");
			
			Thread.sleep(1000);
			police_main pm = new police_main();
			pm.main(args);
		}else if(num == 5) {
			
			RegisterNewCriminalByPolice reg_criminal_pol = new RegisterNewCriminalByPolice();
			reg_criminal_pol.main(args);
			System.out.println("\n");
			System.out.println("\n");
			
			Thread.sleep(1000);
			police_main pm = new police_main();
			
		}else if(num == 6) {
			
			getAllTheCasesInCertainTimeIntervalbyPolice time_int_by_pol = new getAllTheCasesInCertainTimeIntervalbyPolice();
			time_int_by_pol.main(args);
			System.out.println("\n");
			System.out.println("\n");
			
			Thread.sleep(1000);
			police_main pm = new police_main();
			
		}else if(num == 7) {
			Demo exit = new Demo();
			exit.main(args);
			System.out.println("\n");
			System.out.println("\n");
		}

	}

}
