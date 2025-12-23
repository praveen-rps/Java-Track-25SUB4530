package oops;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		emp1.setDetails();
		emp1.display();
		
		emp2.setDetails();
		emp2.display();
		
		Employee.organization="Wipro Technologies Ltd";
		//emp2.organization="Wipro Technologies Limited";
		emp2.display();
		
		emp1.display();

	}

}
