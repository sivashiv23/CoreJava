import java.util.Scanner;

public class Swap {

	// swapping without the temp variable
	public static void main(String[] args) {

		System.out.println("Enter the numbers");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(" a is " + a);
		System.out.println(" b is " + b);

	}

}
