package List;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
	Set<Integer> s=new TreeSet<>(new MyComparator());
	s.add(111);
	s.add(10);
	s.add(15);
	System.out.println(s);
	Set<Integer> s1=new TreeSet<>();
	s1.add(111);
	s1.add(10);
	s1.add(15);
	System.out.println(s1);
	}
}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2);
	}
	
}
