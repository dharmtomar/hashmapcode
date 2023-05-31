package collectionFramwork;

import java.util.LinkedHashMap;

public class Linkedhashmap {

	public static void main(String[] args) {
		//LinkedHashMap is a class implements map interface
		//LinkedHashMap is used for key value pair and store unique elements
		//HashMap is not synchronized and not thread safe
		//there can be one null key and multiple null values 
		//it maintains insertion order
		//concurrent modification exception--- fail fast condition
		//Methods-  put,remove,get,keySet,values,entrySet

		LinkedHashMap<String, Integer> lm=new LinkedHashMap<>();
		lm.put("hindi", 1);
		lm.put("english", 2);
		lm.put("sanskrit", 3);
		lm.put("urdu", 4);
		lm.put("math", null);
		lm.put("GK", null);
		System.out.println(lm);
		
	}

}
