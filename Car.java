package CS176L;

public class Car {
	double fuelEfficiency;
	double currentFuel= 0;
	
	public Car(double mpg) {
		fuelEfficiency = mpg;
		
	}
	public void drive(double miles) {
		currentFuel = miles / fuelEfficiency;
		
		
		
		
	}
	
	public void addGas(double gallons) {
		currentFuel += gallons;
	}
	public double getGasintank() {
		return currentFuel;
	}
	
	
		
	
	public static void main(String[] args) { 
		Car myCar = new Car(50);
		System.out.println(myCar.getGasintank());
		myCar.addGas(10);
		System.out.println(myCar.getGasintank());
		myCar.drive(20);
		
		
		
		

	}

}
