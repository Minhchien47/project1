package Demo2;

import java.util.Scanner;

public class Operators {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = input.nextInt();
		System.out.println("You entered " + a);
		System.out.print("Enter b: ");
    	int b = input.nextInt();
    	System.out.println("You entered " + b);
    	System.out.println("a+b = " +(a+b) );
    	System.out.println("a-b = " +(a-b) );
    	System.out.println("a%b = " +(a%b) );
    	System.out.println("a/b = " +(a/b) );
    	System.out.println("a++ = " +(a+1) );
    	System.out.println("b-- = " +(b-1) );
    	//System.out.println(check(a,b));
	
	
//	public static String check(int a, int b) {
//			return (a>b) ? "a>b" : "a<=b";
//		
//	}
		if(a>b) {
			System.out.println("a>b");
		}else{
			System.out.println("a<=b");
			}
	}
}
