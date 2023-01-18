package eidiko;

abstract class T
{
	abstract public void t();
	public void p()
	{
		System.out.println("ppppprfve");
	}
}
class De extends T
{
	public void t()
	{
		System.out.println("revrvrtbbvrt");
	}
}
public class Abstractt2 {
	public static void main(String[] args) {
		De d=new De();
		d.p();
		d.t();
	}

}
