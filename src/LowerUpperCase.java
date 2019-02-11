import java.util.Scanner;

public class LowerUpperCase {

	public static void main(String[] args) {
		System.out.println("enter the string in lowecase");
		Scanner s = new Scanner(System.in);
		String lc = s.next().toUpperCase();
		System.out.println("Given Lower case string converted into uppercase " + lc);

		System.out.println("enter the string in uppercase");
		String uc = s.next().toLowerCase();
		System.out.println("Given upper case string converted into lowercase " + uc);

	}

}
