package CollectiomMap;

import java.util.TreeSet;

public class navigablesetdemo {
	public static void main(String[] args) {
		TreeSet<Integer> nv=new TreeSet<Integer>();
		nv.add(1000);
		nv.add(2000);
		nv.add(3000);
		nv.add(4000);
		nv.add(5000);
		System.out.println(nv);
		System.out.println(nv.ceiling(2000));
		System.out.println(nv.higher(2000));
		System.out.println(nv.floor(3000));
		System.out.println(nv.lower(3000));
		System.out.println(nv.pollFirst());
		System.out.println(nv.last());
		System.out.println(nv.descendingSet());
		System.out.println(nv);
	}

}
