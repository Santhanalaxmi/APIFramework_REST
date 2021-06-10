package Abstraction;
abstract class Animal{
	public abstract void sound();
	void disp() {
		System.out.println("HIII");
	}
}
public class Abstract extends Animal{
public void sound() {
	System.out.println("Boo Boo");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstract a=new Abstract();
a.sound();
	}

}
