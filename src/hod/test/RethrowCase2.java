
package hod.test;

import java.io.IOException;

public class RethrowCase2
{
	public static void main(String[] args)
	{
		
	}
	
	public static void test() throws Exception
	{
		try  
		{
			System.out.println("first try - A");
			throw new Exception();
		}
		catch (Exception e)
		{
			try
			{
				System.out.println("second try - B");
				throw new IOException();
			}
			catch (Exception exception1)
			{
				throw e;
			}
		}
	}
	
	
}
