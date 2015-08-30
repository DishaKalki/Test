package inherit;

public class ThreadDemo 
{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());	
		FirstThread first=new FirstThread();
		Second second=new Second();
		Thread t=new Thread(first);
		t.start();
		System.out.println(Thread.currentThread().getName());	
		Thread t1=new Thread(second);
		t1.start();
	
	}
	
}

