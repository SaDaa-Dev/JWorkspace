package DatatypeTest;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c1 = new HashSet<>();
		c1.add("one");
		c1.add("two");
		
		Collection<String> c2 = Arrays.asList("three","four");
		Collection<String> c3 = Collections.singleton("five");
		
		c1.addAll(c2);
		c1.addAll(c3);
		
		System.out.println("Size of c1 : " + c1.size());
		
		Object[] converted1 = c1.toArray();
		String[] converted2 = c1.toArray(new String[c1.size()]);
		
		for(String s : c1) {
			System.out.println(s);
		}
		
		for(int i = 0  ; i < converted2.length; i ++) {
			System.out.println(converted2[i]);
		}
		
		Iterator iter = c1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		c1.forEach(System.out::println);
		
		
	}

}
