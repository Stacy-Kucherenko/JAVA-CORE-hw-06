package lviv.lgs.ua.intfaces;

public class Application {

	public static void main(String[] args) {
		
		SecondEmployee emp2 = new SecondEmployee(3500.8); 
		System.out.println("I'm employee with monthly payment. My monthly " + emp2);
		
		Employee emp = new Employee (23.15);
		System.out.println("I'm employee with hourly payment. My hourly " + emp);
		
		emp.theSalary();
		System.out.println("I'm employee with hourly payment. My monthly " + emp);
		
		
	}
}
