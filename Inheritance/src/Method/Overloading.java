package Method;
class ParentMethod{
	void display(char a) {
		System.out.println(a);
	}
	void display(char a,int b) {
		System.out.println("char:"+a+"int:"+b);
	}
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ParentMethod p=new ParentMethod();
p.display('c');
p.display('a', 10);
	}

}
