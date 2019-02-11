import java.util.Scanner;

public class Pals {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		for (int n = 1; n <= 100; n = n + 1) {
			int a;
			int i, j = 0;
			a = n;
			while (a > 0) {
				i = a % 10;
				j = (j * 10) + i;
				a = a / 10;
			}

			if (n == j) {
				System.out.println(n);
			}

		}
	}
}
