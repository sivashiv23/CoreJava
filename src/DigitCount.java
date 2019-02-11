import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {

		int i = 0;
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while (n > 0) {
			n = n / 10;
			i++;
			System.out.println("i in the loop " + i);
			System.out.println("n in the loop " + n);
		}
		System.out.println("count outer loop i " + i);

	}
}
