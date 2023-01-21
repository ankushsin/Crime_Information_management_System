package com.crime_IMS.dao;

import java.util.List;

import com.crime_IMS.Exception.CrimeException;
import com.crime_IMS.Exception.CriminalException;
import com.crime_IMS.Exception.PoliceException;
import com.crime_IMS.bean.CrimesBean;
import com.crime_IMS.bean.CriminalBean;
import com.crime_IMS.bean.PoliceBean;

public interface AdministrativePoliceDao {
	
	public PoliceBean loginPolice(String name, String password) throws PoliceException;
	
	public List<CrimesBean> SolvedCases() throws CrimeException ;
	
	public List<CrimesBean> UnSolvedCases() throws CrimeException ;
	
	public String UpdateUnsolveToSolve(CrimesBean crimes) throws CrimeException;
	
	public List<CrimesBean> getAllTheCrimesCases() throws CrimeException ;
	
	public String RegisterNewCrime(CrimesBean crimes) throws CrimeException;
	
	public String RegisterNewCriminal(CriminalBean criminal) throws CriminalException;
	
	public String RegisterNewPolice(PoliceBean police) throws PoliceException;

	

}
