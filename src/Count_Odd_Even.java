import java.util.Scanner;

public class Count_Odd_Even {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int evencount = 0;
		int oddcount = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				evencount = evencount + i;

			}

			else if (i % 2 == 1) {
				oddcount = oddcount + i;
			}

		}
		System.out.println("even count " + evencount);
		System.out.println("odd count " + oddcount);
	}

}
