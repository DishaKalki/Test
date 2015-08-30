package inherit;

public class Second extends Thread{
	public Second() {
		// TODO Auto-generated constructor stub
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());	
		try
		{
		Thread.sleep(1000);
		
		System.out.println("wake2");
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
	}
}

