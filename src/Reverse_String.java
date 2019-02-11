import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		String original, reverse = "";
		System.out.println(" enter the string");
		Scanner s = new Scanner(System.in);
		original = s.next();
		int length = original.length();
		System.out.println("length before loop" + length);
		System.out.println("length " + (length - 1)); // since it an index based
		for (int i = length - 1; i >= 0; i--) {
			System.out.println(i);
			System.out.println("orginal char " + original.charAt(i));
			reverse = reverse + original.charAt(i);
		}

		System.out.println("reversed string " + reverse);
	}

}
