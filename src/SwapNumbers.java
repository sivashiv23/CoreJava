import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {

		int c;
		System.out.println("Enter the two numbers ");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		c = a;
		a = b;
		b = c;

		System.out.println(" a is " + a);
		System.out.println("b is " + b);

	}

}
