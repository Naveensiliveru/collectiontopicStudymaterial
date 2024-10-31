package Map.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer , String> map = new HashMap();
		map.put(101, "Madhu");
		map.put(102, "Naveen");
		map.put(103, "Swathi");
		map.put(104, "Vijaya");
		map.put(102, "david");
		System.out.println("Map :"+map.size() );
	Set<Integer> ks =	map.keySet();
	for(Integer key:ks) {
		System.out.println(map.get(ks));
	}
		
		System.out.println(map.containsKey(102));
		System.out.println(map.isEmpty());
		
		Set <Entry<Integer, String>> es=map.entrySet();
		
		System.out.println(map);
		map.clear();
		System.out.println(map.size());
		 
		
		

	}

}
