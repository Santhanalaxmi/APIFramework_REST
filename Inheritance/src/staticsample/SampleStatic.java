package staticsample;

public class SampleStatic {
static int i=10;
static String name="str";

static void get() {
	System.out.println("i: "+i);
	System.out.println("name: "+name);
}
void disp() {
	get();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SampleStatic sam=new SampleStatic();
sam.disp();
get();
	}

}
