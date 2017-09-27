package hod.test;

public class RethrowCase1
{
	public static void main(String[] args)
	{
		
	}
	
	public static void test() throws Exception
	{
		try 
		{
			throw new NullPointerException();
		}
		catch (NullPointerException test2_exception)
		{
			throw new IllegalStateException(test2_exception) ;
		}

	}
}


