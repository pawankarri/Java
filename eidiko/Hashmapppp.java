package eidiko;

import java.util.*;

public class Hashmapppp {
public static void main(String[] args) {
	HashMap m=new HashMap();
	Integer i1=new Integer(10);
	Integer i2=new Integer(10);
	m.put(i1,"pawan");
	m.put(i2,"bobby");
	System.out.println(m);
	LinkedHashMap m1=new LinkedHashMap();
	Integer i3=new Integer(10);
	Integer i4=new Integer(10);
	m1.put(i3,"pawan");
	m1.put(i4,"bobby");
	System.out.println(m1);
}
}
