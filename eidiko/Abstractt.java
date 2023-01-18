package eidiko;

abstract class Demo 
{
	abstract public void play();
}
class Sample1 extends Demo
{
	public void play()
	{
		System.out.println("playing the cricket");
	}
}
public class Abstractt {
	public static void main(String[] args) {
		Sample1 s=new Sample1();
		s.play();
	}

}
