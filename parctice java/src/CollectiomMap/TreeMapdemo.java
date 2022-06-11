package CollectiomMap;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapdemo {
	public static void main(String[] args) {
		   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(100,"Amit");    
		      map.put(102,null);    
		      map.put(101,"Vijay");    
		      map.put(103,null);    
		        
		      for(Entry<Integer, String> m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }    
	}

}
