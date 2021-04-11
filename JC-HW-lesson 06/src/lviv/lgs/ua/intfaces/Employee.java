package lviv.lgs.ua.intfaces;

public class Employee implements Salary {

	private double hourlyPayment;
	
	

	public Employee(double hourlyPayment) {
		super();
		this.hourlyPayment = hourlyPayment;
		
	}
	
	



	public double getHourlyPayment() {
		return hourlyPayment;
	}





	public void setHourlyPayment(double hourlyPayment) {
		this.hourlyPayment = hourlyPayment;
	}





	@Override
	public void theSalary() {
		double monthlySalary = getHourlyPayment() * 8 * 21;
		setHourlyPayment(monthlySalary);
		
		
	}





	@Override
	public String toString() {
		return "salary is " + hourlyPayment;
	}





	
	
	
}
