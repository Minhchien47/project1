package Demo2;

import java.util.Scanner;

public class MainMenu {
	public static Scanner scanner =  new Scanner(System.in);
	public static int inputNumber = 0;
	public static int employeeNo = 0;
	public static Employee[] employees;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
		System.out.println("The program end!!!");
		
	}
	public static void showMenu() {
		do {
	        System.out.println("-----------menu------------");
	        System.out.println("1. Create New Employee.");
	        System.out.println("2. Show List Employee.");
	        System.out.println("3. Exit.");
	        System.out.println("4. Search Employee.");
	        System.out.println("5. Update Employee By Name.");
	        System.out.println("0.Continue");
	        System.out.println("---------------------------");
			System.out.print("Please choose number: ");
			inputNumber = scanner.nextInt();
			switch (inputNumber){		
			case 1:
				addEmployee();
				askForContinue();
				break;
			case 2:
				if(employees != null && employees.length > 0) {
					showEmployee();
				}else {
					System.out.println("Please add new employee first!");
					showEmployee();
				}
				
				askForContinue();
				break;
			case 3:
				//System.out.println("Exit!");
				//System.exit(0);
                break;
			case 0:
				showMenu();
				break;
			case 4:
				System.out.println("Input name to search: ");
				String nameInput = scanner.next();
				Employee employee = searchByName(nameInput);	
				System.out.println("-----Thông tin tìm kiếm-----");
				System.out.println(employee.getId()+"  "+employee.getName()+"  "+employee.getSalary());
				askForContinue();
				break;
			case 5:
				System.out.println("Input name to search: ");
				String nameInputUpdate = scanner.next();
				System.out.println("Input new salary: ");
				double newSalary = scanner.nextDouble();
//				String fullName = "Tran Minh Chien";
//				if(fullName.contains(nameInputUpdate)) {
//					
//				}
				updateEmployeeByName(nameInputUpdate, newSalary);
				askForContinue();
				break;
			default:
				System.out.println("Your input number wrong, please input again: ");
				//showMenu();
				break;			
			}
		}while(inputNumber != 3);
	}
	public static void addEmployee() {
		System.out.println("How many employee you want to input?");
		employeeNo =  scanner.nextInt();
		employees = new Employee[employeeNo];
		for(int i = 0; i<employees.length; i++) {
			System.out.println("Please input the information of employee[" + i + 1 + "] : ");
			System.out.println("Name : ");	
			Scanner scannerName = new Scanner(System.in);
			String name = scannerName.nextLine();
			System.out.println("Salary : ");
			double salary = scanner.nextDouble();
			System.out.println("Age : ");
			int age = scanner.nextInt();
			System.out.println("Job name : ");
			String jobName = scanner.next();
			Employee employee = new Employee(name, i + 1, salary, age, true, new Job(i + 1, jobName));
			employees[i] = employee;
			
		}
	}
	public static void showEmployee() {
		System.out.println("***********Thong tin Employee***********");
		for(int i=0;i<employees.length;i++) {
			System.out.println("Employee: "+ employees[i].getId()+ " " +employees[i].getName()+ " " +employees[i].getSalary()+ " " +employees[i].getJob().name);
		}
	}
	public static void askForContinue() {
		System.out.println("Do you want continue or exit? (Press 3 to end program, 0 to come back menu) :");
	}
	
	public static Employee searchByName(String nameInput) {
		Employee employee = null;
		for (int i = 0; i <= employees.length; i++) {
		        if (nameInput.equals(employees[i].getName())){
		            employee = employees[i];
		            break;
		        }
		    }return employee;
		
	}
	public static void updateEmployeeByName(String nameInput, double newSalary) {
		for (int i = 0; i <= employees.length; i++) {
	        if (nameInput.equals(employees[i].getName())){
	             newSalary = employees[i].getSalary();
	            break;
	        }
	    }
	}
}
