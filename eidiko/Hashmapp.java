package eidiko;

import java.util.*;

public class Hashmapp {
public static void main(String[] args) {
	HashMap m=new HashMap();
	m.put(1000,"harish");
	m.put(999,"mahesh");
	m.put(1001,"rahul");
	m.put(1007,"pawan");
	m.put(999,"durgamahesh");
	System.out.println(m);
	 Set s=m.keySet();
	 System.out.println(s);
	 Collection c=m.values();
	 System.out.println(c);
	 Set s1=m.entrySet();
	 System.out.println(s1);
	 Iterator itr=s1.iterator();
	 while(itr.hasNext())
	 {
		 Map.Entry m1=(Map.Entry) itr.next();
		 if(m1.getKey().equals(1007))
		 {
			 m1.setValue(1007);
		 }
		 System.out.println(m);
	 }
}
}
