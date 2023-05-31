package collectionFramwork;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapinitialization {

	public static void main(String[] args) {
		Map<String , String> map1=new HashMap<>();
		HashMap<String, String> map2=new HashMap<>();
		//jdk 1.9
		//empty map
		Map<String, Integer> map3= Map.of();
		//map3.put("test1", 100);   //java.lang.UnsupportedOperationException
		//System.out.println(map3.get("test1"));
		
		//singleton map - immutable, cant add or update or delete
		Map<String, String> map4= Map.of("india", "delhi");
		System.out.println(map4.get("india"));
		
		//multimap  -immutable
		Map<String, String> map5= Map.of("peter","java","tom","c#");
		System.out.println(map5.get("tom"));
		
		Map<String, String> map6= Map.ofEntries(
				new AbstractMap.SimpleEntry<>("aaa", "bbb"),
				new AbstractMap.SimpleEntry<>("ccc", "ddd"),
				new AbstractMap.SimpleEntry<>("eee", "fff")
				
				);
		System.out.println(map6.get("eee"));
		//using stream- mutable map
		Map<String, Integer> map7= Stream.of(
				new AbstractMap.SimpleEntry<>("cricket",1),
				new AbstractMap.SimpleEntry<>("hockey",2),
				new AbstractMap.SimpleEntry<>("khokho",3),
				new AbstractMap.SimpleEntry<>("chess",4)
				).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map7.get("chess"));
		map7.put("kabaddi", 5);
		System.out.println(map7);
		//using stream- immutable map
		Map<String,String> map8= Stream.of(
				new AbstractMap.SimpleImmutableEntry<String,String>("mohan", "grade- A"),
				new AbstractMap.SimpleImmutableEntry<String,String>("geeta", "grade- B"),
				new AbstractMap.SimpleImmutableEntry<String,String>("sita", "grade- C"),
				new AbstractMap.SimpleImmutableEntry<String,String>("pyare", "grade- A+"),
				new AbstractMap.SimpleImmutableEntry<String,String>("lal", "grade- A++")
				).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		System.out.println(map8.get("lal"));
		map8.put("qqqqqq","eeeee");
		System.out.println(map8.get("qqqqqq"));
		
		Map<String, String> map9= Collections.singletonMap("IIT", "india");
		//map9.put("aa", "ss");
		System.out.println(map9.get("IIT"));
	}
	
}
