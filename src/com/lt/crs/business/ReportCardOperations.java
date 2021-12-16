package com.lt.crs.business;

import com.lt.crs.bean.Reportcard;;

public class ReportCardOperations {
	Reportcard rc[] = new Reportcard[1];
public void displayResult(){
	rc[0] = new Reportcard();
	rc[0].setGrade('A');
	rc[0].setPercent(88);
	rc[0].setResult("PASS");
	for(Reportcard r : rc){		
   		System.out.println("Grade: "+r.getGrade() + " ,Percent: " +r.getPercent()+ " ,Result: " +r.getResult());
	}
}
}
