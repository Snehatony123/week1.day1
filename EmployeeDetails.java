package week1.day2.assignment3;

public class EmployeeDetails {

      public void printEmployeeName(String empName, int empId) {
	  System.out.println("Employee name is " +empName+ " and employeeID is " +empId);
	  }
      public void getEmployeeAddress(String empAddress) {
      System.out.println("Address is "+ empAddress);
      }
      public void printEmployeeSalary(double empSalary) {
      System.out.println("Salary is "+ empSalary);
      }
      public void printEmployeeMobileNumber(long mobNum) {
      System.out.println("Number is "+ mobNum);
      }
      public static void main(String[] args) {
      EmployeeDetails obj=new EmployeeDetails();
      obj.printEmployeeName("Sneha", 56342);
      obj.getEmployeeAddress("Bangalore");
      obj.printEmployeeSalary(30000.56);
      obj.printEmployeeMobileNumber(9785643520L);
      }
      }