package eidiko;
import java.util.*;
public class sortedSet {
public static void main(String[] args) {
	SortedSet s=new TreeSet();
	s.add(245);
	s.add(452);
	s.add(845);
	s.add(120);
	s.add(120);
	s.add(0);
	s.add(-2);
	s.add(299);
	System.out.println(s);
	System.out.println(s.first());

	
	System.out.println(s.headSet(845));
	System.out.println(s.tailSet(452));
	System.out.println(s.subSet(245,845));
	System.out.println(s.comparator());
	s.remove(120);
	System.out.println(s);
	System.out.println(s.contains(-2));
	System.out.println(s.size());
	System.out.println(s.comparator());
}
}
