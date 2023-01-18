package eidiko;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylists {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add("pawan");
	a.add(23.3);
	a.add('a');
	a.add(1);
	a.add(false);
	System.out.println(a);
	Collections.sort(a);
	System.out.println(a);
	System.out.println(a.get(4));
	System.out.println(a.set(1,42.0));
	System.out.println(a);
	System.out.println(a.isEmpty());
	System.out.println(a.size());
	System.out.println(a.contains("pawan"));
	System.out.println(a.indexOf("pawan"));
	a.add(3,25);
	System.out.println(a);
	a.add(25);
	System.out.println(a);
	a.add(null);
	System.out.println(a);
}
}
