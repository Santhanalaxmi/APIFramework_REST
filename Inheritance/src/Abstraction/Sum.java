package Abstraction;
abstract class Addition{
	abstract int sumTwo(int a,int b);
	abstract int sumThree(int a,int b,int c);
	
	public void disp() {
		System.out.println("Addition");
	}
}
public class Sum extends Addition{
int sumTwo(int a,int b) {
	return a+b;
}
int sumThree(int a,int b,int c) {
	return a+b+c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition a = new Sum();
System.out.println(a.sumTwo(5, 6));
System.out.println(a.sumThree(10, 15,20));
a.disp();
	}

}
