package week1.day2.assignment1;

public class TwoWheeler {
	public static void main(String[] args){
	TwoWheeler obj = new TwoWheeler();
	
	int wheelsNumber=obj.noOfWheels();
	System.out.println("No.of wheels");
	System.out.println(wheelsNumber);
	
	short mirrorsNumber=obj.noOfMirrors();
	System.out.println("No.of Mirrors");
	System.out.println(mirrorsNumber);
	
	long numberChassis=obj.chassisNumber();
	System.out.println("Chassis number is");
    System.out.println(numberChassis);
    
    boolean punctured = obj.isPunctured();
    System.out.println("Puncture is");
    System.out.println(punctured);
    
    obj.BikeName();
    System.out.println("Bike Name is");
    System.out.println("DUKE");
   
	double kmRunning=obj.runningKM();
	System.out.println("Total KM is");
	System.out.println(kmRunning);
	}
	
	public int noOfWheels(){
    int noOfWheels=2;
	return noOfWheels;}
	
	public short noOfMirrors(){
	short Mirrors=2;
	return Mirrors;}
	
	public long chassisNumber(){
	long Number=34566789;
	return Number;}
	
	public boolean isPunctured(){
	return false;}
	
	public void BikeName() {}
	
	public double runningKM(){
	double KM=10500;
	return KM;}
  }
