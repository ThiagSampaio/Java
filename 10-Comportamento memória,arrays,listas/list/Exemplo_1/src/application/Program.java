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
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		List<Employee> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			boolean control = true;
			while(control == true){
				System.out.printf("Employee #%d:\n", i+1);
				System.out.print("Id: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Salary: ");
				double salary = sc.nextDouble();
				Employee empTest = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
				if(empTest == null) {
					Employee emp = new Employee(id,name,salary);
					list.add(emp);
					control=false;
				}
				else {
					System.out.println("This id already exists!");
					control=true;
				}
			}
		}
		System.out.println();
		System.out.print("Enter the employee id that will hava salary increase: ");
		int id = sc.nextInt();
		Employee empIncrease = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(empIncrease == null) {
			System.out.println("This id does not exist!");
		}
		else{
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			empIncrease.increaseSalary(percentage);
		}
		
		System.out.println("List of employees:");
		for(Employee e:list) {
			System.out.println(e);
		}
		
		
		
		
		sc.close();
		
		

	}

}
