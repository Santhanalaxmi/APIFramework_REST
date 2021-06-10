package demoInheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car car=new Car(4);
car.setLicensePlate("TN23 A5645");
System.out.println(car);
SportsCar sports=new SportsCar(2, 150);
sports.setLicensePlate("SportsTN450");
System.out.println(sports);
	}

}
