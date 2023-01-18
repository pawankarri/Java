package eidiko;
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("child thread");
		}
	}
}
public class Threadssss {
public static void main(String[] args) {
	MyThread m=new MyThread();
	m.start();
	for(int i=0;i<10;i++)
	{
		System.out.println("parent thread");
	}
}
}
