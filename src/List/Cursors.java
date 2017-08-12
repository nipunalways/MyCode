package List;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Cursors {

	public static void main(String[] args) {
		Vector<String> v= new Vector<>();
		v.add("First");
		v.add("second");
		v.add("third");
		Enumeration<String> e= v.elements();
		Iterator<String> itr= v.iterator();
		ListIterator<String> lItr= v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(lItr.getClass().getName());
		
		List<String> l= new ArrayList<>();
		Iterator<String> itrL= l.iterator();
		ListIterator<String> lItrL= l.listIterator();
		System.out.println(itrL.getClass().getName());
		System.out.println(lItrL.getClass().getName());
		

	}

}
