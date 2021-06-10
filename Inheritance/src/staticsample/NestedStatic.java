package staticsample;

public class NestedStatic {
static String str="world";

static class FirstNested{
	void disp() {
		System.out.println(str);
	}
	void get() {
		str="hello";
		System.out.println("new str "+str);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NestedStatic.FirstNested nest=new NestedStatic.FirstNested();
//nest.disp();
nest.get();
	}

}
