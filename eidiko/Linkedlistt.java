package eidiko;
import java.util.*;
public class Linkedlistt {
public static void main(String[] args) {
	LinkedList l=new LinkedList();
	l.add("hi");
	l.add(123);
	l.add("hi");
	l.add(null);
	l.add(false);
	l.addFirst("mani");
	l.addLast("krishna");
	System.out.println(l.size());
	System.out.println(l.isEmpty());
	System.out.println(l.contains(null));
	System.out.println(l);
}
}
