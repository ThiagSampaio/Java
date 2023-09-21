package application;

import java.util.Scanner;
import java.util.Locale;

import java.util.ArrayList;
import java.util.List;


import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How may employees wil be registered?");
		int N = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			System.out.printf("Employee #%d\n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id,name,salary);
			list.add(emp);
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id_increase = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id_increase).findFirst().orElse(null);
		if (emp== null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		System.out.println();
		System.out.println("List od employess:");
		for(Employee e:list) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		sc.close();
		
		

	}

}
