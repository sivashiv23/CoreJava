import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = s.nextInt();
		if (a % 2 == 0) {
			System.out.println("the given number is even ");
		} else if (a % 2 == 1) {
			System.out.println("the given number is odd");
		}

	}

}
