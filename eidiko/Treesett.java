package eidiko;
import java.util.*;
public class Treesett {
public static void main(String[] args) {
	TreeSet t=new TreeSet();
	t.add(15);
	t.add(25);
	System.out.println(t);
	t.add(15);
	System.out.println(t);
	t.pollFirst();
	System.out.println(t);
	t.pollLast();
	System.out.println(t);
	t.add(3);
	System.out.println(t);
}
}
