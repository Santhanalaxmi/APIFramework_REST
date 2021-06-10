package demoInheritance;
class EncapsulationHead{
	private int empNo;
	private String name;
	private String role;
	
	int getNo() {
		return empNo;
	}
	String getName() {
		return name;
	}
	String getRole() {
		return  role;
	}
	void setNo(int no) {
		empNo=no;
	}
	void setName(String str) {
		name=str;
	}
	void setRole(String r) {
		role=r;
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EncapsulationHead en =  new EncapsulationHead();
en.setNo(100);
en.setName("Hippo");
en.setRole("dept");
System.out.println(en.getNo());
System.out.println(en.getName());
System.out.println(en.getRole());
	}

}
