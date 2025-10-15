package functional.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program03 {

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
		
//		class idcompare implements Comparator<Employee>{
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.id-o2.id;
//			}
//		}

//		idcompare id = new idcompare();
//		empList.sort(id);
		
		// id is an Object of an Anonymous Inner Class
		Comparator<Employee> id = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.id-o2.id;
			}
		};

		empList.sort(id); // Anonymous object of anonymouse inner class
		
		System.err.println("Display all employees sorted on empid in asc order -> ");
		display(empList);
		
		
//		class namecompare implements Comparator<Employee>{
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.name.compareTo(o2.name);
//			}
//		}
		
		//name is An object of anonymous inner class.
		Comparator<Employee> name = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name);
			}
		};
		
		empList.sort(name); // Anonymous object of anonymouse inner class
		
		System.err.println("Display all employees sorted on empname in asc order -> ");
		display(empList);
		
		
//		class salarycompare implements Comparator<Employee>{
//			@Override
//			public int compare(Employee o1 , Employee o2) {
//			    return Double.compare(o2.salary,o1.salary);
//			}
//		}
		
		//salary is An object of anonymous inner class.
		Comparator<Employee> salary = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1 , Employee o2) {
				return Double.compare(o2.salary,o1.salary);
			}
		};
		
		empList.sort(salary);// Anonymous object of anonymouse inner class

		
		System.err.println("Display all employees sorted on empsalary in desc order -> ");
		display(empList);
		
	}

}
