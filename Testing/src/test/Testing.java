package test;

public class Testing {

	String name; // instance or class or global variables

	public static void main(String[] args) {

		int stdAge = 23;

		System.out.println("age is " + stdAge);

		Testing test = new Testing(); // object creation
		
		
		
		Demo demo = new Demo();
		
		
	}

	void add() {

		name = "raja";

		System.out.println(name);
		int stdAge = 23;

		System.out.println(stdAge);
	}

	void sub() {
		name = "Bala";
		System.out.println(name);
	}

	private void doSome() {
		System.out.println("do some");

	}
}
