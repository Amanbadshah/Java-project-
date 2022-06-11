import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicate {
	public static void main(String[] args) {
		ArrayList<String> i=new ArrayList<String>();
		i.add("Aman");
		i.add("Aman");
		i.add("Sunfiyan");
		System.out.println(i);
		System.out.println("revers");
		Collections.reverse(i);
		Iterator<String> itr=i.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		LinkedHashSet<String> l=new LinkedHashSet<String>(i);
		System.out.println("Dupilcate remove");
		System.out.println(l);
		Iterator<String> it=l.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
