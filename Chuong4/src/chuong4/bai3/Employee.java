/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 24, 2025 3:22:04 PM
 */

package chuong4.bai3;

import java.text.DecimalFormat;

public abstract class Employee {
	protected final String thePayrollNumber;
	protected String theName;
	protected double theBasicMonthlySalary;
	
	
	public Employee() {
		this("000000", "Nguyen Van A", 0.0);
	}

	public Employee(String thePayrollNumber, String theName,
			double theBasicMonthlySalary) {
		this.thePayrollNumber = "";
		if(thePayrollNumber == null || thePayrollNumber.isEmpty()) {
			throw new IllegalArgumentException("The payroll number not is null");
		}
		setTheName(theName);
		setTheBasicMonthlySalary(theBasicMonthlySalary);
	}

	public String getTheName() {
		return theName;
	}

	public void setTheName(String theName) {
		if(theName == null || theName.isEmpty()) {
			theName = "Nguyen Van A";
		}
		this.theName = theName;
	}

	public double getTheBasicMonthlySalary() {
		return theBasicMonthlySalary;
	}

	public void setTheBasicMonthlySalary(double theBasicMonthlySalary) {
		if(theBasicMonthlySalary < 0) {
			theBasicMonthlySalary = 0.0;
		}
		this.theBasicMonthlySalary = theBasicMonthlySalary;
	}

	public String getThePayrollNumber() {
		return thePayrollNumber;
	}
	
	public abstract double getMonthlySalary();
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,### VND");
		return String.format("%s | %s | %s", 
				thePayrollNumber, 
				theName, 
				df.format(theBasicMonthlySalary));
	}
}

