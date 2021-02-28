package scanner;

import java.util.Scanner;

public class ScannerAddation {

	public static void main(String[] args) {
		
		int a, b;
		int c;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter 2 number?");
		a= sc.nextInt();
		b= sc.nextInt();
		c=a+b;
		
		System.out.println("Addition of 2 number is "+ c);
		System.out.println("Addation of "+ a + "+"+ b + "="+ c);
	}

}

/* OUTPUT 
 * enter 2 numbers? 23 54
 * 
 * addition of 2 number is 77
 * 
 * addition of 23 + 54 = 77
 * 
 */