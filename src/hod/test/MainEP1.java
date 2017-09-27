package hod.test;


public class MainEP1
{
	public static void main(String[] args) throws Exception {
		entrypoint1();
	}
	
	public static void entrypoint1() throws Exception 
	{
		int i;
		for( i = 1; i <= 4000; i++)
		{
			Thread.sleep(1000);
			System.out.println("Num:" + i + "/4000");
			Main.test(10, 1, 10000);
		}	
	}
}
