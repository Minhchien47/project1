package Demo2;

import java.util.Scanner;

public class ExSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Nhập vào chức năng bạn muốn dùng: ");
		Scanner s = new Scanner(System.in);
		String name = " ";
		int chucnang = s.nextInt();
		switch (chucnang) {
			case 1:
				System.out.println("Nhập vào tên người dùng: ");
				break;
			case 2:
				System.out.println("Tên của  người dùng là" + name);
				break;
			case 3:break;
			default:
				System.out.println("vui lòng chức năng khác");		
			}
	}

}
