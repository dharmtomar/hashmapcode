package collectionFramwork;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Hashtableconcept {

	public static void main(String[] args) {
		//its a class that implements map  interface
		//it is synchronize and thread safe
		//it contains unique values only so no null key or null value allowed 
		//key---objects---hashcode---value
		
		Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
		ht.put("A", 1);
		ht.put("B", 2);
		ht.put("C", 3);
		ht.put("D", 4);
		System.out.println(ht);
		

		Hashtable ht1=new Hashtable();
		ht1= (Hashtable)ht.clone();		
		System.out.println("value is "+ht1);
		System.out.println(ht.contains(2));
		Enumeration e= ht.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		Set s=ht.entrySet();
		System.out.println(s);
		for(Entry<String, Integer> ee:ht.entrySet()) {
			System.out.println("key is "+ee.getKey()+" value is- "+ee.getValue());
		}
		System.out.println(ht.get("B"));
		System.out.println(ht.hashCode());
		System.out.println(ht1.hashCode());
		
	}

}
