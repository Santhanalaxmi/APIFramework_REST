package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     ArrayList<Integer> alist=new ArrayList<>();
//     alist.add(12);
//     alist.add(20);
//     alist.add(24);
//     alist.add(40);
//     alist.add(39);
//     alist.add(56);
//     System.out.println(alist);
//     alist.add(60);
//     System.out.println(alist);
//     alist.add(3, 225);
//     System.out.println(alist);
//     alist.set(0, 25);
//     System.out.println(alist);
//     alist.remove(2);
//     System.out.println(alist);
//     alist.remove(5);
//    for(int i:alist) {
//    	System.out.println(i);
//    }
//    System.out.println(alist.size());
//	}
ArrayList<String> list=new ArrayList<String>();
list.add("sri");
list.add("depp");
list.add("hishu");
list.add("sandal");
System.out.println(list);
list.add("ap");
list.add(4, "divi");
Collections.sort(list);
for(String str:list) {
	System.out.println(str);
}
Collections.sort(list,Collections.reverseOrder());
list.remove(5);
list.set(2,"pri");
System.out.println(list);
System.out.println(list.size());
int pos=list.indexOf("hishu");
System.out.println(pos);
}
}