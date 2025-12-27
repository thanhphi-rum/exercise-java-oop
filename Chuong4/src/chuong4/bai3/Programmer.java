/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 24, 2025 3:42:42 PM
 */

package chuong4.bai3;

public class Programmer extends Employee {
	private String theLanguage;
	
	public Programmer() {
		super();
	}

	public Programmer(String thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		setTheLanguage(theLanguage);
	}

	public String getTheLanguage() {
		return theLanguage;
	}

	public void setTheLanguage(String theLanguage) {
		if(theLanguage == null || theLanguage.isEmpty()) {
			theLanguage = "Unidentified";
		}
		this.theLanguage = theLanguage;
	}

	@Override
	public double getMonthlySalary() {
		double bonus = 0;
		if("Java".equalsIgnoreCase(theLanguage)) {
			bonus = theBasicMonthlySalary * 0.2;
		}
		return theBasicMonthlySalary + bonus;
	}
	
	@Override
	public String toString() {
		return String.format("%s | %s", 
				super.toString(), 
				theLanguage);
	}
}

