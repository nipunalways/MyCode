package List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListExamples {
	public static void main(String arg[]){
		List<String> l=new ArrayList<>();
		l.add("first");
		l.add("second");
		l.add("third");
		ListIterator<String> li=l.listIterator();
		while(li.hasNext()){
			System.out.println(li.next());
		}
		//index of list starts from 0
		System.out.println(l.indexOf("first"));
		l.add(3, "fourth");
		li=l.listIterator();
		while(li.hasNext()){
			System.out.println(li.next());
		}
		System.out.println(l.get(0));
		l.set(0, "newFirst");
		li=l.listIterator();
		while(li.hasNext()){
			System.out.println(li.next());
		}
	}
}
