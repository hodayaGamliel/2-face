package hod.test;

import java.util.Scanner;

public class Main
{
	static int runOpt = 0;
	static int stackSize = 10 ;
	static int testNum = 0 ;
	static int times = 100 ;
	
	static Scanner sc = new Scanner(System.in);  

	public static void main(String[] args) throws Exception
	{
		userAsk();
	}
	
	public static void userAsk() throws Exception
	{
		System.out.println("Enter times to run:");  
		times = sc.nextInt();	
  
   	 	System.out.println("Enter size of stack:");  
   	 	stackSize = sc.nextInt();	
   	 	
   	 	System.out.println("Enter num of test (1 - Caught, 2 - Uncaught, 3 - Rethrow-case1, 4 - Rethrow-case2, 5 - Rethrow-case3)");  
   	 	testNum = sc.nextInt();	
   	 	
   	 	test(stackSize,testNum,times);

	}
	
	public static void test(int stackSize,int testNum, int times) throws Exception
	{
		for (int i = 0; i < times; i++)
		{
			System.out.println("");
			System.out.println("############");
			System.out.println("############");
			System.out.println("############");
			System.out.println("");
			
			System.out.println("times: " + i + "/" + times);
			System.out.println("testNum: " + testNum);
			System.out.println("stackSize: "+ stackSize);
		
			System.out.println("");
			System.out.println("############");
			System.out.println("############");
			System.out.println("############");
			System.out.println("");

			
			StackCreate.recursionAndBoom(stackSize,testNum);
			Thread.sleep(500);
		}
	}	
}
