package day37;

import java.util.*;

public class TimeCheck {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		LinkedList ll = new LinkedList();
		long start = System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			a1.add(0,String.valueOf(1));
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList 작업시간:"+(end-start));
		
		start =System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			ll.add(0,String.valueOf(i));
		}
		end=System.currentTimeMillis();
		System.out.println("LinkedList 작업시간:"+(end-start));
	}

}
 