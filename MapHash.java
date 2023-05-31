package collectionFramwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapHash {
	//HashMap is a class implements map interface
	//HashMap is used for key value pair and store unique elements
	//HashMap is not synchronized and not thread safe
	//there can be one null key and multiple null values 
	//it maintains no order
	//concurrent modification exception--- fail fast condition
	//Methods-  put,remove,get,keySet,values,entrySet
	
	public static void main(String[] args) {
		Map<String, Integer> map1=new HashMap<>();
		map1.put("java", 80);
		map1.put("rubi", 70);
		map1.put("perl", 60);
		map1.put("php", 75);
		map1.put("javascript", 78);
		int keyvalue1=map1.get("rubi");
		System.out.println(keyvalue1);
		System.out.println(map1);
		for(Map.Entry<String, Integer> m:map1.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}
		for(String key:map1.keySet()) {
			System.out.println(key);
		}		
	for(int value:map1.values()) {
		System.out.println(value);
	}
	map1.remove("php");
	System.out.println(map1);
	HashMap<Integer, Emp> hm=new HashMap<Integer,Emp>();
	Emp emp1=new Emp("peter1", "bsc", 2, 25);
	Emp emp2=new Emp("peter2", "msc", 3, 26);
	Emp emp3=new Emp("peter3", "BA", 4, 27);
	Emp emp4=new Emp("peter4", "MA", 5, 28);

	hm.put(1, emp1);
	hm.put(2, emp2);
	hm.put(3, emp3);
	hm.put(4, emp4);
	for(Entry<Integer, Emp> e:hm.entrySet()) {
		System.out.println("name is- "+e.getValue().name);
		System.out.println("course is- "+e.getValue().course);
		System.out.println("id is- "+e.getValue().id);
		System.out.println("age is- "+e.getValue().age);
	}
	
	}

}
