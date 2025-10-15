package functional.lambda;

public class Employee {
	int id;
	String name;
	Double salary;
	
	public Employee() {

	}

	public Employee(int id, String name, Double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
