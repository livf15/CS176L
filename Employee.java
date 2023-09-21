package CS176L;

public class Employee {
	
	private String employeeName;
	public double currentSalary=50000;
	
	public Employee(String name, int i) {
		employeeName = name;
		

	}
	
	public double getSalary() {
		
		return currentSalary;
		
	
	}
		
	
	public void raiseSalary(double byPercent) {
	
		
		
			
		}
	
	String getName() {
	 return employeeName;
			 
	}
	
	

	public static void main(String[] args) {
		Employee liv = new Employee("Olivia", 50000);
		liv.getName();
		liv.getSalary();
		liv.raiseSalary(10); 
		System.out.println("Employee Name: "+ liv.getName());
		System.out.println("Salary :"+ liv.getSalary());
		
		
		
		
		
		
		
		
	}

}
