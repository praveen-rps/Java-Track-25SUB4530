package oops;

public class Employee {
	
	int empid;
	String name;
	String department;
	String designation;
	static String organization;
	
	
	public void display() {
		System.out.println("empid = "+empid+" Name = "+name +" Department = "+department+" Designation = "+designation+" "+organization);
	}
	
	public void setDetails() {
		empid=1001;
		name="Praveen";
		department="Quality";
		designation="Trainee";
		organization="Wipro";
	}
	
	static{
		System.out.println("Inside the static block..!");
	}
	{
		System.out.println("Inside the non static block..!");
	}
	

}
