
public class UC3 {
   public static void main(String[] args) {
      System.out.println("Welcome to Employee Wage Computation");
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs, empWage;
		int empCheck = (int)Math.floor(Math.random() * 10) %3;
		if ( empCheck == IS_FULL_TIME ){
			System.out.println("Employee is Present");
			empHrs = 8;
		}
		else if (empCheck == IS_PART_TIME){
         System.out.println("Employee is Part Time Present");
         empHrs = 4;
      }
		else {
			System.out.println("Employee is Absent");
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage:" +empWage);
	}
}
