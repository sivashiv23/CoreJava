import java.util.Scanner;

public class UniqueCharacters {

	static final int no_of_chars = 256;

	/* Print duplicates present in the passed string */
	static void printDistinct(String str) {
		// Create an array of size 256 and count of
		// every character in it
		int[] count = new int[no_of_chars];

		/* Count array with frequency of characters */
		int i;
		for (i = 0; i < str.length(); i++)
			if (str.charAt(i) != ' ')
				count[(int) str.charAt(i)]++;
		System.out.println("count[(int) str.charAt(i)] in loop 1" + count[(int) str.charAt(i)]);
		System.out.println("count[(int) str.charAt(i)]++;  in loop1" + count[(int) str.charAt(i)]++);

		int n = i;
		System.out.println("i " + i);
		System.out.println("n " + i);

		// Print characters having count more than 0
		for (i = 0; i < n; i++)
			if (count[(int) str.charAt(i)] == 1)
				System.out.print(str.charAt(i));
	}

	/* Driver program */
	public static void main(String args[]) {
		String str = "GeeksforGeeks";
		printDistinct(str);
	}
}