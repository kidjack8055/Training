package scanner;

import java.util.Scanner;

public class RuntimeInput {

	public static void main(String[] args) {

		// scanner input declaration
		Scanner scan = new Scanner(System.in);

		System.out.println("enter ur age?");
		int age = scan.nextInt();
		System.out.println("you are " + age + " years old");

		System.out.println("enter ur name?");
		String name = scan.next();
		System.out.println("Welcome " + name);

		System.out.println("enter ur salary?");
		float salary = scan.nextFloat();
		System.out.println("super u have " + salary + " Rs");

		System.out.println("enter ur tax?");
		double tax = scan.nextDouble();
		System.out.println("nice u paying " + tax + " rs tax yearly");

		scan.close();
	}
}