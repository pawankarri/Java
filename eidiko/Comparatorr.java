package eidiko;

import java.util.*;

public class Comparatorr {
public static void main(String[] args) {
	TreeSet t=new TreeSet(new MyComparator());
			t.add(10);
	t.add(5);
	t.add(20);
	t.add(99);
	t.add(3);
	System.out.println(t);
}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer) obj1;
		Integer i2=(Integer) obj2;
		if(i1>i2)
		{
			return -1;
		}
		else
		{
			return +1;
		}
	}
}
