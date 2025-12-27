/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 24, 2025 4:01:35 PM
 */

package chuong4.bai3;

public class ProjectLeader extends Employee {
	
	public ProjectLeader(String thePayrollNumber, String theName, double theBasicMonthlySalary) {
		super(thePayrollNumber, theName, theBasicMonthlySalary);
	}

	@Override
	public double getMonthlySalary() {
		return theBasicMonthlySalary + (theBasicMonthlySalary * 0.2);
	}

}

