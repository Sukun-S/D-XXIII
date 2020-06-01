public class UC2 {
   public static void main(String[] args) {
      System.out.println("Welcome to Employee Wage Computation");
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs, empWage;
		int empCheck = (int)Math.floor(Math.random() * 10) %2;
		if ( empCheck == IS_FULL_TIME ){
			System.out.println("Employee is Present");
			empHrs = 8;
		}
		else {
			System.out.println("Employee is Absent");
			empHrs = 0;
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage:" +empWage);
	}
}
