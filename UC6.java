public class UC6 {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
   public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_WORKING_HRS = 100;

   public static void main(String[] args) {
      System.out.println("Welcome to Employee Wage Computation");
		int empHrs, empWage=0, totalWage=0, totalEmpHrs=0, totalWorkingDays=0;
		while (totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
		int empCheck = (int)Math.floor(Math.random() * 10) %3;
		switch ((int)empCheck){
		case IS_FULL_TIME:
			System.out.println("Employee is Present");
			empHrs = 8;
		break;
		case IS_PART_TIME:
         System.out.println("Employee is Part Time Present");
         empHrs = 4;
      break;
		default:
			System.out.println("Employee is Absent");
			empHrs = 0;
		break;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage:" +empWage);
		totalWage += empWage;
	}
	System.out.println("Total Wage for a month is :" +totalWage);
	}
}
