package CollectiomMap;

import java.util.Hashtable;

public class Hashtabledemo {
	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put(new Temp(5),"Hashtable Demo");
		h.put(new Temp(11),"SHaikh 11");
		h.put(new Temp(6),"6th index");
		h.put(new Temp(4),"4th Index");
		System.out.println(h);
		
	}
}
class Temp{
	int i;
	Temp(int i){
		this.i=i;
	}
	public int hasCode() {
		return i;
		
	}
	public String toString() {
		return i+"";
	}
}
