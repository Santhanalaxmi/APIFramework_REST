package Aggregation;

class Address{
	int dNo;
	String Street;
	String City;
	String Country;
	public Address(int dNo, String street, String city, String country) {
		super();
		this.dNo = dNo;
		Street = street;
		City = city;
		Country = country;
	}
	
}

public class Student {
int rollNo;
String name;
Address StudentAddr;
	public Student(int rollNo, String name, Address studentAddr) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	StudentAddr = studentAddr;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Address add=new Address(2, "Muruga", "CBE", "India");
Student st=new Student(100, "XXX", add);
System.out.println(st.rollNo);
System.out.println(st.name);
System.out.println(st.StudentAddr.dNo);
System.out.println(st.StudentAddr.Street);
System.out.println(st.StudentAddr.City);
System.out.println(st.StudentAddr.Country);

	}

}
