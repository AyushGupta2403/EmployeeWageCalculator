
public class EmployeeWage {
	//Constants
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static void main(String[] args) {
		//Variables
		int totalEmpHrs = 0, totalEmpWage = 0, totalWorkingDays = 0;
		//Computation
<<<<<<< HEAD
		while ( totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS ){
			totalWorkingDays++;
			int empHrs = 0;
			int empCheck =(int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck){
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
      	int empWage = empHrs * EMP_RATE_PER_HOUR;
      	totalEmpWage += empWage;
      	System.out.println("Employee Wage : " +empWage);
		}
		System.out.println("Total Employee Wage: " + totalEmpWage);
=======
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage : " +empWage);
>>>>>>> UC2_Calculate_Wage
	}
}
