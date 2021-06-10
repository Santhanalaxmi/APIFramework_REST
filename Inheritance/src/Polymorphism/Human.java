package Polymorphism;

public class Human {

public Human(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

String name;
String city;

void disp() {
	System.out.println("Name of the human "+name+"City he lives "+city);
}

}
