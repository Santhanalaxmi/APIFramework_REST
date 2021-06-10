package Method;
class parent{
	String str="Sandal";
	protected void disp() {
		System.out.println("hai "+str);
	}
}
public class Overriding extends parent{
	//String str="laxmi";
protected void disp() {
	System.out.println("hai"+str);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent p =new parent();
p.disp();
parent p1=new Overriding();
p1.disp();
	}

}
