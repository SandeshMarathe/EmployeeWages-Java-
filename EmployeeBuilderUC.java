public class EmployeeBuilderUC
{
	public static void main(String ars[])
	{
		//Constant
		int IS_FULL_TIME=1;

		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;

		if (empCheck == IS_FULL_TIME)
		{
			System.out.println("Employee Is Present...");
		}
		else
		{
			System.out.println("Employee Is Absent...");
		}
	}
}
