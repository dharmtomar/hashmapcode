package collectionFramwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arratlist {

	public static void main(String[] args) {
		//It implements list interface
		//it maintains insertion order
		//duplicate values can be stored
		//it allow random access based on index
		//its not synchronized and not thread safe
		//it internally use dynamic array
		
		ArrayList<Object> ar=new ArrayList<>();

		ar.add(100);
		ar.add("dharm");
		ar.add('a');
		ar.add(true);
		ar.add(2, 200);
		System.out.println(ar.get(2));
		System.out.println(ar);
		System.out.println(ar.get(2));
		
		ArrayList<String> ar1=new ArrayList<>();
		ar1.add("ram");
		ar1.add("gita");
		ar1.add("shyam");
		ar1.add("mohan");
		//ar1.add("shiva");
		
		ArrayList<String> ar2=new ArrayList<>();
		ar2.add("java");
		ar2.add("php");
		ar2.add("c");
		ar2.add("c++");
		ar2.add("ram");
		//ar2.addAll(ar1);
		for(int i=0;i<ar2.size();i++) {
		System.out.println(ar2.get(i));
		
		}
		System.out.println("---------");
		ArrayList<String> ar3=new ArrayList<>();
		ar3.add("ram");
		ar3.add("gita");

		
		ArrayList<String> ar4=new ArrayList<>();
		ar4.add("java");
		ar4.add("ram");
		ar4.retainAll(ar3);
		for(int i=0;i<ar4.size();i++) {
			System.out.println(ar4.get(i));
			
			}
		
		Emp emp1=new Emp("dharm","mca", 5, 30);
		Emp emp2=new Emp("titu","MBA", 6, 31);
		Emp emp3=new Emp("kevin","pgdca", 7, 32);
		Emp emp4=new Emp("dhinga","mtech", 8, 33);
		
	ArrayList<Emp> al5=new ArrayList<Emp>();
	al5.add(emp1);
	al5.add(emp2);
	al5.add(emp3);
	al5.add(emp4);
	for(int i=0;i<al5.size();i++) {
		String empname=al5.get(i).name;
		String course=al5.get(i).course;
		int id=al5.get(i).id;
		int age=al5.get(i).age;
		System.out.println(empname);
		System.out.println(course);
		System.out.println(id);
		System.out.println(age);
	}
	System.out.println("---2---iterating through iterator");
	Iterator<String> it1= ar2.iterator();
	while(it1.hasNext()) {
		System.out.println(it1.next());
	}
	System.out.println("-----3----iterating through foreach");
	for(String arl:ar2) {
		System.out.println(arl);
	}
	System.out.println("-----4----iterating through lamda with foreach");
	ar2.forEach(lm->{
		System.out.println(lm);
	});
	System.out.println("-----5----iterating through listiterator");
	ListIterator<String> itl=ar2.listIterator();
	while(itl.hasNext()) {
		System.out.println(itl.next());
	}
	System.out.println("-----6----iterating through foreachremaining");
	it1= ar2.iterator();
	it1.forEachRemaining(vall->{
		System.out.println(vall);
	});
	System.out.println("-----7----iterating through listiterator");
	ListIterator<String> itl2=ar2.listIterator(ar2.size());
	while(itl2.hasPrevious()) {
		System.out.println(itl2.previous() );
	}
	}

}
