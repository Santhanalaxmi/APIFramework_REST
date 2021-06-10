package demoInheritance;

public class Car extends Vehicle{
	int noOfSeats=0;
public Car(int seats) {
		super();
		// TODO Auto-generated constructor stub
		noOfSeats=seats;
	}
public void setLicensePlate(String license) {
	super.setLicensePlate(license);
}

public String toString() {
	return "The car has "+noOfSeats+ "seats. Its license is "+licensePlate;

}

public int getSeats() {
	return this.noOfSeats;
}

}