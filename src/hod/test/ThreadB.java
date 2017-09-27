package hod.test;

public class ThreadB implements Runnable 
{
	@Override
	public void run() {
				try {
					Thread.sleep(500);
					Main.test(15, 1, 10000);
				} catch (Exception e) {
					// TODO: handle exception
				}
	}
}
