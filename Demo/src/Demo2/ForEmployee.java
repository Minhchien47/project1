package Demo2;

public class ForEmployee {

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
		
		for(int i=0;i<5;i++) {
			System.out.println("Nhan vien: "+ employees[i].id+ " " +employees[i].name+ " " +employees[i].Salary+ " " +employees[i].job.name );
		}
		
	}

}
