package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
		public static ArrayList<Employee> arrEmployee;
		public static void showMenu() {
	        System.out.println("-----------menu------------");
	        System.out.println("1. Add Employee.");
	        System.out.println("2. Show Employee.");
	        System.out.println("3. Exit.");
	        System.out.println("---------------------------");
	        System.out.print("Please choose: ");
		}
	
		public static void chooseMenu() {
			Scanner scanner = new Scanner(System.in);		
			showMenu();
			int choose = scanner.nextInt();			
			switch (choose){		
			case 1:
				addEmployee();
				chooseMenu();
				break;
			case 2:
				showEmployee();	
				chooseMenu();
				break;
			case 3:
				System.out.println("Exit!");
				System.exit(0);
                break;
			default:
				chooseMenu();
				break;
			}
		}	

		public static void addEmployee() {
			Scanner empl = new Scanner(System.in);
			System.out.println("Create Employee: ");
			System.out.println("Enter Name: ");
			String name = empl.nextLine();
			System.out.println("Enter Age: ");
			int age = empl.nextInt();
			arrEmployee = new ArrayList<Employee>();
			Employee e = new Employee(name, age);
			arrEmployee.add(e);
			}
	
		public static void showEmployee() {
			System.out.println("Employees: ");
			for(int i=0; i<arrEmployee.size(); i++){		
				System.out.println(arrEmployee.get(i).getName() +"   "+arrEmployee.get(i).getAge());
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			chooseMenu();
			
	}
	
}
