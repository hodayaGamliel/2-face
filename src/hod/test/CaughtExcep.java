package hod.test;

public class CaughtExcep
{
	public static void main(String[] args) throws InterruptedException
	{
	}
	
	public static void test()
	{
		try 
		{
			throw new NullPointerException();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
