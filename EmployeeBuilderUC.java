public class EmployeeBuilderUC
{

	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HRS_IN_MONTH=100;

	public static void main(String ars[])
	{

		//Variables
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		while (totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
		{
			totalWorkingDays++;
			//Computation
			double empCheck = Math.floor(Math.random() * 10) % 3;

			switch((int) empCheck)
			{
				case IS_PART_TIME:

					empHrs=4;
				break;
				case IS_FULL_TIME:
					empHrs=8;
				break;
				default:
					empHrs=0;
				break;
			}
			totalEmpHrs +=empHrs;
			System.out.println("Day# :"+totalWorkingDays+"Emp Hrs: "+empHrs);
		}
		int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
		System.out.println("total Emp Wage : "+totalEmpWage);
	}
}
