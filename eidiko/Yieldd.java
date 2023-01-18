package eidiko;
class MyyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
			Thread.yield();
		}
	}
}
public class Yieldd {
public static void main(String[] args) {
	MyyThread t=new MyyThread();
	t.start();
	for(int i=0;i<10;i++)
	{
		System.out.println("parent thread");
	}
}
}
