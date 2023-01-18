package eidiko;
interface Aaa
{
	public void d();
}
class Bc implements Aaa
{
	public void d()
	{
		System.out.println("executing d method");
	}
}
public class Inter {
	public static void main(String[] args) {
		Bc b=new Bc();
		b.d();
		
	}

}
