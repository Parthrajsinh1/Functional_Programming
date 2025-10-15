package functional.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program04 {

	public  static void display(List<Employee> empList) {
		for(Employee e:empList)
			System.out.println(e);
		System.out.println("------------------------------------------------");
	}
	
	public static void main(String[] args) {
	
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(4, "Mukesh", 20000.00));
		empList.add(new Employee(1, "Anil", 40000.00));
		empList.add(new Employee(5, "Ram", 30000.00));
		empList.add(new Employee(3, "Ramesh", 10000.00));
		empList.add(new Employee(2, "Suresh", 50000.00));		
		
		System.err.println("display all eemployee in unsorted order -> ");
		display(empList);
		 
//	Comparator<Employee> name = new Comparator<Employee>() {
//		
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			return o1.name.compareTo(o2.name);
//		}
//	};
//	
//	empList.sort(name); 

		empList.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1,Employee o2) {
				return o1.id-o2.id;
			}
		});
		
		System.err.println("Display all employees sorted on empid in asc order -> ");
		display(empList);
		
		empList.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		
		System.err.println("Display all employees sorted on empname in asc order -> ");
		display(empList);
		
		empList.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return Double.compare(o2.salary, o1.salary);
			}
		});

		
		System.err.println("Display all employees sorted on empsalary in desc order -> ");
		display(empList);
		
	}

}
