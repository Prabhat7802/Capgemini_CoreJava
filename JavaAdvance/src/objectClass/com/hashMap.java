package objectClass.com;

import java.util.HashMap;

//HashMap-Java HashMap class implements the Map interface which allows us to store key and value pair,
//where keys should be unique.
public class hashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();

		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(3, "Banana");//ignore duplicate
		
		System.out.println(map);
		System.out.println(map.entrySet());//Returns a Set view of the mappings contained in this map
		System.out.println(map.keySet());//Returns a set view of keys
		System.out.println(map.values());//Return a set views of values
		
		//Removes the specified key
		System.out.println(map.remove(2));
		System.out.println(map);
		
		//put elements in map2 to map 
		map2.put(5, "papaya");
		map2.put(6, "gauva");
		
		map.putAll(map2);//copies all the elements from map2 to map
		System.out.println(map);
		
		//returns boolean if map is empty or not
		System.out.println(map.isEmpty());
		
		
	}

}
