package hod.test;

import java.util.Scanner;

public class MainThreads
{


	public static void main(String[] args)
	{
		test();
	}
	
	public static void test()
	{
		try 
		{
			Thread.sleep(500);

			ThreadA tr1 = new ThreadA();
			Thread tr11 = new Thread(tr1);
			tr11.start();
			
			Thread.sleep(500);

			ThreadB tr2 = new ThreadB();
			Thread tr22 = new Thread(tr2);
			tr22.start();
		}
		catch (Exception e) 
		{}
	}
}
