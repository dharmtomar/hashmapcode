package collectionFramwork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String, String> hm1=new HashMap<String,String>();
		hm1.put("India", "delhi");
		hm1.put("lanka", "kolambo");
		hm1.put("nepal", "kathmandu");
		hm1.put("us", "WDC");
		hm1.put("uk", "london");
		System.out.println(hm1);
		for(Entry<String, String> e:hm1.entrySet()) {
			String key=e.getKey();
			String value=e.getValue();
			System.out.println("key is "+key+" and value is "+value);
	}
		System.out.println("-------------------------");
		for(String st:hm1.keySet()) {
			System.out.println(st);
		}
		System.out.println("--------------------------");
		Iterator<Entry<String, String>> ie= hm1.entrySet().iterator();
		while(ie.hasNext()) {
			Entry<String,String> entry=ie.next();
			String key2=entry.getKey();
			String value2=entry.getValue();
			System.out.println("Key is- "+key2+" value is "+value2);
		}
		System.out.println("---------------");
		hm1.forEach((K,V) ->{ System.out.println("key is "+K+" value is "+V);
		});
	}

}
