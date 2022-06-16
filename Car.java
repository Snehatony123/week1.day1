package week1.day2.assignment2;

public class Car {
public static void main(String[] args) {
	Car obj=new Car();
	obj.applyBreak();
	obj.applyGear();
	obj.switchOnAc();
	obj.applyAcclerate();
	}	
	public void applyBreak(){
		System.out.println("Break");
	}
	public void applyGear(){
		System.out.println("Gear");
	}
	public void switchOnAc(){
		System.out.println("Switch on AC");
	}
	public void applyAcclerate(){
		System.out.println("Apply Accelerate");
	}
}


