package lviv.lgs.ua.intfaces;

public class SecondEmployee implements Salary {
	
	private double monthlyPayment;
	
	

	public SecondEmployee(double monthlyPayment) {
		super();
		this.monthlyPayment = monthlyPayment;
	}



	public double getMonthlyPayment() {
		return monthlyPayment;
	}



	public void setMonthlyPayment(double monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	






	@Override
	public String toString() {
		return "salary is " + monthlyPayment;
	}



	@Override
	public void theSalary() {
		
		
	}
	

}
