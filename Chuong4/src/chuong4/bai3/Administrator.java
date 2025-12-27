/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 24, 2025 3:56:36 PM
 */

package chuong4.bai3;

public class Administrator extends Employee {
	private String theDepartment;
	
	public Administrator() {
		super();
	}

	public Administrator(String thePayrollNumber, String theName, double theBasicMonthlySalary, String theDepartment) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
		this.theDepartment = theDepartment;
	}

	public String getTheDepartment() {
		return theDepartment;
	}

	public void setTheDepartment(String theDepartment) {
		this.theDepartment = theDepartment;
	}

	@Override
	public double getMonthlySalary() {
		return theBasicMonthlySalary + (theBasicMonthlySalary * 0.4);
	}
	
	@Override
	public String toString() {
		return String.format("%s | %s", 
				super.toString(), 
				theDepartment);
	}
}

