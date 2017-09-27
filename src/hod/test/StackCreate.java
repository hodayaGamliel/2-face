package hod.test;

public class StackCreate
{
	public static void main(String[] args)
	{
		
	}
	
	public static int recursionAndBoom(int n, int test) throws Exception
	{
		if (n == 1)
		{
			boom(test);
			return n;
		}
		else
		{
			n = recursionAndBoom(n-1, test);
			return n ;
		}
	}

	public static void boom(int test) throws Exception
	{
		switch (test)
		{
			case 1:
				CaughtExcep.test();
				break;
				
			case 2:
				UncaughtExcep.test();
				break;
		
			case 3:
				RethrowCase1.test();
				break;
				
			case 4:
				RethrowCase2.test();
				break;
			
			case 5:
				RethrowCase3.testCatch();
				break;				
				
			case 6:
				RethrowCase3.testThrow();
				break;			
			
			default:
				System.out.println("Undefined option!");
				break;
		}
	}

	
}
