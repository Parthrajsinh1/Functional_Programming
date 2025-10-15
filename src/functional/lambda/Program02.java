package functional.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program02 {

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
		
		class idcompare implements Comparator<Employee>{
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.id-o2.id;
			}
		}

//		idcompare id = new idcompare();
//		empList.sort(id);
		
//		Comparator<Employee> id = new idcompare(); //up-casting
//		empList.sort(id);
				
		empList.sort(new idcompare()); // Anonymous object
		
		System.err.println("Display all employees sorted on empid in asc order -> ");
		display(empList);
		
		
		class namecompare implements Comparator<Employee>{
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name);
			}
		}
		
//		namecompare name = new namecompare();
//		empList.sort(name);
		
		empList.sort(new namecompare()); // Anonymous object
		
		System.err.println("Display all employees sorted on empname in asc order -> ");
		display(empList);
		
		
		class salarycompare implements Comparator<Employee>{
			@Override
			public int compare(Employee o1 , Employee o2) {
			    return Double.compare(o2.salary,o1.salary);
			}
		}
//		salarycompare salary = new salarycompare();
//		empList.sort(salary);
		
		empList.sort(new salarycompare()); //Anonumous object
		
		System.err.println("Display all employees sorted on empsalary in desc order -> ");
		display(empList);
		
	}

}
