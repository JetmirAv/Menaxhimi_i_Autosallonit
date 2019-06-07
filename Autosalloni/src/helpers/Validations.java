package helpers;

public class Validations {

	public static boolean emailValidation(String email) {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		return email.matches(regex);
	}

	public static boolean passwordValidation(String password) {
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		return password.matches(regex);
	}

	public static int numberConverter(String number) throws NumberFormatException {
		return Math.abs(Integer.parseInt(number));
	}

	public static boolean phoneValidation(String number) {
		System.out.println(number);
		if (number.charAt(0) == '+') {
			number = number.substring(1);
			System.out.println(number);
		}
		String pattern = "\\d{11}|\\d{9}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
		return number.matches(pattern);
	}

	public static boolean cardNumberValidation(long number) {
		return (getSize(number) >= 13 && getSize(number) <= 16)
				&& (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
						|| prefixMatched(number, 6))
				&& ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
	}

	// Get the result from Step 2
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 2; i >= 0; i -= 2)
			sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);

		return sum;
	}

	// Return this number if it is a single digit, otherwise,
	// return the sum of the two digits
	public static int getDigit(int number) {
		if (number < 9)
			return number;
		return number / 10 + number % 10;
	}

	// Return sum of odd-place digits in number
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		String num = number + "";
		for (int i = getSize(number) - 1; i >= 0; i -= 2)
			sum += Integer.parseInt(num.charAt(i) + "");
		return sum;
	}

	// Return true if the digit d is a prefix for number
	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}

	// Return the number of digits in d
	public static int getSize(long d) {
		String num = d + "";
		return num.length();
	}

	// Return the first k number of digits from
	// number. If the number of digits in number
	// is less than k, return number.
	public static long getPrefix(long number, int k) {
		if (getSize(number) > k) {
			String num = number + "";
			return Long.parseLong(num.substring(0, k));
		}
		return number;
	}

}
