package inherit;

public class FirstThread implements Runnable
{
	public FirstThread() 
	{
		// TODO Auto-generated constructor stub
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());	
		try
		{
		Thread.sleep(5000);
		System.out.println("wake");
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
	}
}
