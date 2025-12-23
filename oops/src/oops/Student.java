package oops;

public class Student {
	
	int htno;
	String name;
	String branch;
	
	
	
	Student(int h, String n, String b){
		
		name=n;
		branch=b;
		htno=h;
		System.out.println("Inside the  constructor..!");
		
	}
	
	public void display() {
		System.out.println("Name  = "+name+"Branch = "+branch+" Htno = "+htno);
	}

}

// Singleton class ----> which has no instances objects