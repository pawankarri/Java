package eidiko;
interface F
{
	void z();
}
interface X extends F
{
	void c();
}
class V implements X
{
	public void z()
	{
		System.out.println("z method");
	}
	public void c()
	{
		System.out.println("c method");
	}
}
public class Sam {
	public static void main(String[] args) {
		V v=new V();
		v.c();
		v.z();
	}

}
