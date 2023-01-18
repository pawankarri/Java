package eidiko;
class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("child thread");
	}
}
public class Runnableee {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	MyRunnable m=new MyRunnable();
	Thread t=new Thread(m);
	t.start();
	System.out.println(t.getPriority());
	System.out.println(t.getName());
	System.out.println("main thread");
}
}
