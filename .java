package collections;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

 class wq{
	static ArrayList<Integer> data() {
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		for(int i=0;i<15;i++) {
			a.add(i);
		}
		
		for (int i=30;i>=15;i--) {
			a.add(i);
		}
		
		for (int i=10;i<20;i++) {
			a.add(i);
		}
		
		System.out.println("the array list "+a);
			return a;
	}
	
}
class aa{
	static LinkedList<Integer> vv() {
		LinkedList<Integer> f = new LinkedList<Integer>(wq.data());
		
		System.out.println("the linkedlist "+f);
		return f;
	}
}

class bb{
	static HashSet<Integer> rr() {
		HashSet<Integer> q=new HashSet<Integer>(aa.vv());
		System.out.println("the hashset is "+q);
		return q;
	}
}

class cc{ 
	static LinkedHashSet<Integer> abc() {
		LinkedHashSet<Integer> ae=new LinkedHashSet<Integer>(bb.rr());
		System.out.println("the linkedhashset is "+ae);
		return ae;
		
	}
}

class ee{
	static TreeSet<Integer> az() {
		TreeSet<Integer> a=new TreeSet<Integer>(cc.abc());
		System.out.println("the treeset is "+a);
		return a;
	}
}
public class list {

	public static void main(String[] args) {
		wq.data();
		aa.vv();
		bb.rr();
		cc.abc();
		ee.az();

	}

}
