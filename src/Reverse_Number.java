import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = s.nextInt();
		int a;
		int i, j = 0;
		a = n;
		while (a > 0) {
			i = a % 10;
			j = (j*10) + i;
			a = a / 10;
		}
		System.out.println(j);
	}
	
}
