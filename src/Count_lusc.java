
public class Count_lusc {

	public static void main(String[] args) {
		int lcase = 0;
		int ucase = 0;
		int schar = 0;
		int digits = 0;

		String s = "Welcome 123 @!@#";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				System.out.println("c in first loop " + c);
				ucase = ucase + 1;
			} else if (Character.isLowerCase(c)) {
				System.out.println("c in second loop " + c);
				lcase = lcase + 1;
			} else if (Character.isDigit(c)) {
				System.out.println("c in third loop " + c);
				digits = digits + 1;
			} else
				schar++;
		}
		System.out.println("l case " + lcase);
		System.out.println("u case " + ucase);
		System.out.println("characters " + schar);
		System.out.println("Numbers " + digits);
	}
}
