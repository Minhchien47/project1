package Demo2;

public class Employee {
	private String name;
	private int id;
	private double Salary;
	private int Age;
	private boolean Married;
	private Job job;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public boolean isMarried() {
		return Married;
	}
	public void setMarried(boolean married) {
		Married = married;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
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
