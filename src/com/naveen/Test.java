package com.naveen;

import java.util.ArrayList;
import java.util.List;

public class Test {
	private static List<employee> findfemaleEmployees(List <employee>lst){
		
	List<employee>lstOfFemales= new ArrayList<>();
	for(employee e :lst) {
		if(e.getGender().equalsIgnoreCase("female")) {
			lstOfFemales.add(e);
			System.out.println(e);
			
		}//end if
	System.out.println("===============");	
	}//end for
	return lstOfFemales;
	}
	private static  List<employee> findFresherEmployee(List<employee>lst){
	 List<employee>lstOfFreshers = new  ArrayList<>();
	for(employee e :lst) {
		if(e.getYearInorg()<=1) {
			lstOfFreshers.add(e);
			System.out.println(e);
			
		}
	}
	return lstOfFreshers;
	}
			

	public static void main(String[] args) {
	List< employee> lstOfemp = new ArrayList<>();
	lstOfemp.add(new employee(7171, "miller", 5 ,"male"));
	lstOfemp.add(new employee(7173, "swetha", 3 ," female"));
	lstOfemp.add(new employee(7112, "naveen", 2 ,"male"));
	lstOfemp.add(new employee(7178, "sreevani", 3 ,"female"));
	lstOfemp.add(new employee(7177, "mohan", 5 ,"male"));
	lstOfemp.add(new employee(7175, "madhu", 5 ,"female"));
	lstOfemp.add(new employee(7174, "sherya", 1 ,"female"));
	

			
		}
	

	

}

