package collectionFramwork;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		//it maintains insertion order also
		//works on indexes
		//it has 1st node as head and last node as tail  and every node has address of next node.
		//duplicate data can be stored
		//its not synchronized and not thread safe
		//its internally use doubly linklist
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("test1");
		ll.add("test2");
		ll.add("test3");
		ll.add("test4");
		System.out.println(ll);
		ll.addFirst("test0");
		ll.addLast("test5");
		System.out.println(ll);
		ll.add(0,"addfe" );
		System.out.println(ll.get(0));
		
	}
}
