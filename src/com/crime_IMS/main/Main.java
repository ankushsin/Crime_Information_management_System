package com.crime_IMS.main;

import java.util.List;
import java.util.Scanner;


import com.crime_IMS.Exception.CrimeException;
import com.crime_IMS.Exception.CriminalException;
import com.crime_IMS.Exception.PoliceException;
import com.crime_IMS.bean.AdministratorBean;
import com.crime_IMS.bean.CrimesBean;
import com.crime_IMS.bean.CriminalBean;
import com.crime_IMS.bean.PoliceBean;
import com.crime_IMS.dao.AdministrativePoliceDao;
import com.crime_IMS.dao.AdministrativePoliceDaoImpl;
import com.crime_IMS.dao.PoliceDao;
import com.crime_IMS.dao.PoliceDaoImpl;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome To Crime Information Management System");
		
		Scanner sce = new Scanner(System.in);
		System.out.println("Enter 1 for Administrator Login");
		System.out.println("Enter 2 for Police Login");
		
		int num = sce.nextInt();
		
		if(num == 1) {
			System.out.println("Enter Username: ");
			String username = sce.next();

			System.out.println("Enter password: ");
			String password = sce.next();
			
			AdministrativePoliceDao daoo = new AdministrativePoliceDaoImpl();
			
			try {
				AdministratorBean admin = daoo.loginPolice(username, password);
				
				System.out.println("Welcome "+admin.getAdministrator_rank()+" "+admin.getAdministrator_name());
				
//				-----------------------------------------------------------------------

				
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
				
				int option = sce.nextInt();
				sce.nextLine();
				
				if(option ==1) {
					AdministrativePoliceDao dao = new AdministrativePoliceDaoImpl();
					
					try {
						List<CrimesBean> crimes = dao.SolvedCases();
						crimes.forEach(crime -> System.out.println(crime));
						
					} catch (CrimeException e) {
						System.out.println(e.getMessage());
					}
				}
				
				else if(option ==2) {
					
					AdministrativePoliceDao dao = new AdministrativePoliceDaoImpl();
					
					try {
						List<CrimesBean> crimes = dao.UnSolvedCases();
						crimes.forEach(crime -> System.out.println(crime));
						
					} catch (CrimeException e) {
						System.out.println(e.getMessage());
					}
					
					
				}
				
				else if(option ==3) {
					
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
				
				else if(option ==4) {
					
					AdministrativePoliceDao dao = new AdministrativePoliceDaoImpl();
					
					try {
						List<CrimesBean> crimes = dao.getAllTheCrimesCases();
						crimes.forEach(crime -> System.out.println(crime));
						
					} catch (CrimeException e) {
						System.out.println(e.getMessage());
					}
					
					
				}
				
				else if(option == 5) {
					
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
				
				else if(option == 6) {
					
					
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
				
				else if(option ==7) {
					
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
				
				else if(option == 8) {
					
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
				
				else if(option == 9) {
					
					Main exit = new Main();
					exit.main(args);
					
				}
				
				
				
				
				
				
				
				
			} catch (PoliceException e) {
				System.out.println(e.getMessage());
			}

		}
		
		else if(num ==2) {
			
			
			System.out.println("Enter Username: ");
			String username = sce.next();

			System.out.println("Enter password: ");
			String password = sce.next();
			
			PoliceDao daoo = new PoliceDaoImpl();
			
			try {
				PoliceBean police = daoo.loginPolice(username, password);
				System.out.println("welcome "+ police.getPolice_name());
				
//				-------------------------------------------------------------------------
				
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
				
				
				int option = sce.nextInt();
				sce.nextLine();
				
				if(option ==1) {
					

					PoliceDao dao = new PoliceDaoImpl();
					
					try {
						List<CrimesBean> crimes = dao.SolvedCases();
						crimes.forEach(crime -> System.out.println(crime));
					} catch (CrimeException e) {
						System.out.println(e.getMessage());
					}
					
					
				}
				
				else if(option ==2) {
					
					PoliceDao dao = new PoliceDaoImpl();
					
					try {
						List<CrimesBean> crimes = dao.UnSolvedCases();
						crimes.forEach(crime -> System.out.println(crime));
					} catch (CrimeException e) {
						System.out.println(e.getMessage());
					}
					
					
				}
				
				else if(option == 3) {
					

					PoliceDao dao = new PoliceDaoImpl();
					
					try {
						List<CrimesBean> crimes = dao.getAllTheCrimesCases();
						crimes.forEach(crime -> System.out.println(crime));
						
					} catch (CrimeException e) {
						System.out.println(e.getMessage());
					}
					
					
				}
				
				else if(option == 4) {
					
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
					
					PoliceDao dao = new PoliceDaoImpl();
					try {
						String result = dao.RegisterNewCrime(crime);
						System.out.println(result);
						
					} catch (CrimeException e) {
						System.out.println(e.getMessage());
					}
					
					
				}
				
				else if(option == 5) {
					
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
					
					PoliceDao dao = new PoliceDaoImpl();
					
					try {
						String result = dao.RegisterNewCriminal(criminal);
						System.out.println(result);
						
					} catch (CriminalException e) {
						System.out.println(e.getMessage());
					}
					
					
				}
				
				else if(option ==6) {
					
					
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Enter The Start date of your interval in YYYY-MM-DD");
					String startdate = sc.nextLine();
					
					System.out.println("Enter The End date of your interval in YYYY-MM-DD");
					String enddate = sc.nextLine();
					
					PoliceDao dao = new PoliceDaoImpl();
					try {
						List<CrimesBean> crimes = dao.getAllTheCrimesCasesinCertaInTimeInterval(startdate, enddate);
						crimes.forEach(crime -> System.out.println(crime));
						
					} catch (CrimeException e) {
						System.out.println(e.getMessage());
					}
					
					
				}
				
				else if(option == 7) {
					Main exit = new Main();
					exit.main(args);
					
				}
				
				
				
				
			} catch (PoliceException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
