package CollectiomMap;

import java.util.TreeMap;

public class Navigablemapdemo {
	public static void main(String[] args) {
		TreeMap <String,Integer> tm=new TreeMap<String,Integer>();
		tm.put("A",01);
		tm.put("ab",02);
		tm.put("Abc", 03);
		tm.put("Aman",04);
		tm.put("Laptop", 05);
		System.out.println(tm);
		System.out.println(tm.ceilingKey("ab"));
		System.out.println(tm.higherKey("Abc"));
		System.out.println(tm.floorKey("x"));
		System.out.println(tm.lowerKey("s"));
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		System.out.println(tm.descendingMap());
		System.out.println(tm);
		
}

}
