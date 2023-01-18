package eidiko;
import java.util.*;
public class Hashsett {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(23);
	h.add(51.02);
	h.add("string");
	h.add (23);
	h.add(null);
	System.out.println(h);
	h.remove(23);
	System.out.println(h);
	h.contains(23);
	System.out.println(h);
System.out.println(h.size());
System.out.println(h.isEmpty());
}
}
