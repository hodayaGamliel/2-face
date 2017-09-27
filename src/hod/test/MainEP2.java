package hod.test;

public class MainEP2
{
	public static void main(String[] args) throws Exception {
		entrypoint2();
	}
	
	public static void entrypoint2() throws Exception 
	{
		int i;
		for( i = 1; i <= 2000; i++)
		{
			Thread.sleep(1000);
			System.out.println("Num:" + i + "/2000");
			Main.test(10, 1, 10000);
			
		}	
	}
}
