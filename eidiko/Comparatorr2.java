package eidiko;
import java.util.*;
public class Comparatorr2 {
public static void main(String[] args) {
	TreeSet t=new TreeSet(new MyComparatorr());
	t.add("pawan");
	t.add("rakesh");
	t.add("nikhil");
	t.add("mahesh");
	System.out.println(t);
}
}
class MyComparatorr implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
