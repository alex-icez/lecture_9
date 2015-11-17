package lecture_9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sample3 {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();//
		new LinkedList<>();
		l.add(10);
		l.add(434);
		Integer r = l.get(0);
		
		Set<Integer> s = new LinkedHashSet<>();//new TreeSet<>();//new HashSet<>();
		s.add(1);
		s.add(2);
		s.add(1);
		for(Integer i : s) 
			System.out.println(i);
		
		Iterator<Integer> iter = s.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
	}
}
