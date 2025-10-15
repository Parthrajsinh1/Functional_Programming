package functional.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program07 {

	public static void display(List<Employee> empList) {
//		empList.forEach(new Consumer<Employee>() {
//			@Override
//			public void accept(Employee e) {
//				System.out.println(e);
//			}
//		});
		empList.forEach(e->System.out.println(e));
		System.out.println("------------------------------------------------");
	}

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(4, "Mukesh", 20000.00));
		empList.add(new Employee(1, "Anil", 40000.00));
		empList.add(new Employee(5, "Ram", 30000.00));
		empList.add(new Employee(3, "Ramesh", 10000.00));
		empList.add(new Employee(2, "Suresh", 50000.00));
															//check for each.
		System.err.println("display all eemployee in unsorted order -> ");
		display(empList);

		empList.sort((o1, o2) -> o1.id - o2.id);

		System.err.println("Display all employees sorted on empid in asc order -> ");
		display(empList);
								
		empList.sort((o1,o2)->o1.name.compareTo(o2.name));

		System.err.println("Display all employees sorted on empname in asc order -> ");
		display(empList);
								
		empList.sort((o1,o2)->Double.compare(o2.salary,o1.salary));

		System.err.println("Display all employees sorted on empsalary in desc order -> ");
		display(empList);

	}

}
