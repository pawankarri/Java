package eidiko;
class Join extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("small thread");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
public class Joinn {
public static void main(String[] args) throws InterruptedException
{
	Join j=new Join();
	j.start();
	j.join();
	for(int i=0;i<10;i++)
	{
		System.out.println("big thread");
	}
}
}
