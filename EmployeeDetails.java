package week1.day2.assignment3;

public class EmployeeDetails {
public static void main(String[] args) {
	EmployeeDetails obj = new EmployeeDetails();
	obj.EmpName();
	obj.EmpID();
	obj.EmpAddress();
	obj.EmpSalary();
	obj.EmpMobileNum();
   }
   public String EmpName() {
   System.out.println("Employee Name is");
   String EmpName="John";
   System.out.println(EmpName);
   return EmpName;
   }
   public int EmpID() {
   System.out.println("Employee ID is");
   int EmpID=56784;
   System.out.println(EmpID);
   return EmpID;
   }
   public String EmpAddress() {
   System.out.println("Employee Address is");
   String EmpAddress="Kozhikode";
   System.out.println(EmpAddress);
   return EmpAddress;
   }
   private double EmpSalary() {
   System.out.println("Employee Salary is");
   double EmpSalary=500000;
   System.out.println(EmpSalary);
   return EmpSalary;
   }
   private long EmpMobileNum() {
   System.out.println("Employee Mobile Number is");
   long EmpMobileNum=978640024;
   System.out.println(EmpMobileNum);
   return EmpMobileNum ;
   }
 }
