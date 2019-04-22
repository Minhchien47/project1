package Demo2;

public class Employee {
	protected String name;
	protected int id;
	protected double Salary;
	protected int Age;
	protected boolean Married;
	protected Job job;
	
	public Employee(String name, int id, double salary, int age, boolean married, Job job) {
		super();
		this.name = name;
		this.id = id;
		Salary = salary;
		Age = age;
		Married = married;
		this.job = job;
	}
	public void print() {
		System.out.println("Name is "+name);
		System.out.println("ID : " +id);
		System.out.println("Age " +Age);
		System.out.println("Salary " +Salary);
		System.out.println("Job " +job.name);
		System.out.println("Married " +Married);
		
		
	}
}
