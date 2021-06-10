package Polymorphism;

public class AAA extends Human{
public AAA(String name, String city) {
		super(name, city);
		// TODO Auto-generated constructor stub
	}
@Override

void disp() {
	System.out.println("Human AAA");
}
 public static void main(String[] args) {
	Human h = new AAA("hi", "cbe");
	h.disp();
}

}
