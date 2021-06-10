package demoInheritance;

public class SportsCar extends Car{

	private double Speed=0;

	public SportsCar(int seats,double speed) {
		super(seats);
		// TODO Auto-generated constructor stub
		Speed=speed;
	}
@Override
public void setLicensePlate(String license) {
	this.licensePlate=license.toLowerCase();
}
@Override
public String toString() {
	return super.toString() +" . Its maxSpped is "+Speed;
}
}
