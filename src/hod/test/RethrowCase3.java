package hod.test;

import java.io.EOFException;

public class RethrowCase3
{
	public static void main(String[] args)
	{
		
	}
	
	public static void testCatch() throws EOFException
	{
		int stackSize = 10;
		try
		{
			StackCreate.recursionAndBoom(stackSize,6);

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void testThrow() throws EOFException
	{
		throw new EOFException();
	}
	

}
