package eidiko;
interface Z
{
	void z();
}
class Q implements Z
{
	public void z()
	{
		System.out.println("executing");
	}
}
class W implements Z
{
	public void z()
	{
		System.out.println("executing"
				+ "");
	}
}
public class Inncc {
public static void main(String[] args) {
	Q q=new Q();
	q.z();
	W w=new W();
	w.z();
}
}
