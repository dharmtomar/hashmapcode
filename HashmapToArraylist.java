package collectionFramwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashmapToArraylist {

	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("Test1", 1000);
		hm.put("Test2", 1001);
		hm.put("Test3", 1002);
		hm.put("Test4", 1003);

		for(Map.Entry<String, Integer> hm1:hm.entrySet()) {
			System.out.println(hm1.getKey()+hm1.getValue());
		}
		ArrayList<String> al1=new ArrayList<String>(hm.keySet());
		for(String ss:al1) {
			System.out.println(ss);
		}
		ArrayList<Integer> al2=new ArrayList<>(hm.values());
		for(Integer vv:al2) {
			System.out.println(vv);
			
		}
	}
	

}
