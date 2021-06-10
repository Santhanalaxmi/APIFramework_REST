package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> list=new LinkedList<>();
list.addFirst("jihi");
list.add("kidi");
list.add(2, "gigi");
list.addLast("fifi");
System.out.println(list);
Iterator<String> itr=list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

	}

}
