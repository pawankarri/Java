package eidiko;
import java.util.*;
public class Hashtablee {
public static void main(String[] args) {
	Hashtable h=new Hashtable();
	h.put(new Temp(5),"A");
	h.put(new Temp(25),"Z");
	h.put(new Temp(53),"F");
	h.put(new Temp(54),"I");
	h.put(new Temp(53),"a");
	System.out.println(h);
	}
}
class Temp
{
	int i;
	Temp(int i)
	{
		this.i=i;
	}
	public int hashcode()
	{
		return i%9;
	}
	public String toString()
	{
		return i+" ";
	}
}
