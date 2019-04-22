package Demo2;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job j1 = new Job(1, "HR");
		Job j2 = new Job(2, "BA");
		Job j3 = new Job(3, "Tester");
		Job j4 = new Job(4, "Developer");
		Job j5 = new Job(5, "CEO");
		Employee e1 = new Employee("Nguyen Van A", 1, 3000, 28, true, j1);
		Employee e2 = new Employee("Nguyen Van B", 2, 4000, 28, true, j2);
		Employee e3 = new Employee("Nguyen Van C", 3, 5000, 30, false, j3);
		Employee e4 = new Employee("Nguyen Van D", 4, 6000, 30, true, j4);
		Employee e5 = new Employee("Nguyen Van E", 5, 7000, 35, false, j5);
		
		Employee[] employees = new Employee[5];
		employees[0] = e1;
		employees[1] = e2;
		employees[2] = e3;
		employees[3] = e4;
		employees[4] = e5;
		System.out.println("Mang co " + employees.length + " phan tu");
		
		System.out.println("***********Thong tin Employee***********");
		System.out.println("ID  NAME        	Salary	 Job");
		System.out.println(e5.id + "  " + e5.name +"         "+e5.Salary+ "   "+e5.job.name);
		System.out.println(e4.id + "  " + e4.name +"         "+e4.Salary+ "   "+e4.job.name);
		System.out.println(e3.id + "  " + e3.name +"         "+e3.Salary+ "   "+e3.job.name);
		System.out.println(e2.id + "  " + e2.name +"         "+e2.Salary+ "   "+e2.job.name);
		System.out.println(e1.id + "  " + e1.name +"         "+e1.Salary+ "   "+e1.job.name);
		
	}

}
