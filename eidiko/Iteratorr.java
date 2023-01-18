package eidiko;
import java.util.*;
public class Iteratorr {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	for(int i=0;i<10;i++)
	{
		a.add(i);
	}
	Iterator l=a.iterator();
	while(l.hasNext())
	{
		Integer ii=(Integer) l.next();
		if(ii%2==0)
		{
			System.out.println(ii);
		}
		else
		{
			l.remove();
		}
		
	}
}
}
