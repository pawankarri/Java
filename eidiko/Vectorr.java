package eidiko;
import java.util.*;
public class Vectorr {
public static void main(String[] args) {
	Vector v=new Vector(5);
	v.addElement("eidiko");
	v.addElement(45.21);
	v.addElement(false);
	v.addElement(1);
	v.addElement(123);
	System.out.println(v);
	System.out.println(v.capacity());
	for(int i=1;i<=10;i++)
	{
		v.addElement(i);
	}
	System.out.println(v.capacity());
	System.out.println(v.elementAt(12));
	v.removeElementAt(10);
	System.out.println(v);
}
}
