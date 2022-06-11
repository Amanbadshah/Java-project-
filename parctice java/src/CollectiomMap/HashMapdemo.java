package CollectiomMap;

import java.util.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapdemo {
	public static void main(String[] args) {
		HashMap <String,Integer>  m= new HashMap();
		m.put("AMAN", 18000);
		m.put("Aamir", 1000);
		m.put("balance",2000);
		System.out.println(m);
		m.put("AMAN", 18500);
		System.out.println(m);
		Set s=m.keySet();
		System.out.println(s);
		Collection c=m.values();
		System.out.println(c);
		Set s1=m.entrySet();
		System.out.println(m);
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m2=(Map.Entry)itr.next();
			System.out.println(m2.getKey()+ "= " +m2.getValue());
		if(m2.getKey().equals("balance")) {
			m2.setValue(25000);
		}
		}
		System.out.println(m);
		
		
	}

}
