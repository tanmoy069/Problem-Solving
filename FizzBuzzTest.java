package VentureTest;

import java.util.*;

public class FizzBuzzTest {
	static Scanner s = new Scanner(System.in);
	public static String FizzBuzz(int num) {
		if (num % 3 == 0 && num % 5 == 0)
			return "FizzBuzz";
		if (num % 3 == 0)
			return "Fizz";
		if (num % 5 == 0)
			return "Buzz";
		return null;

	}

	public static void main(String[] args) {
		// keep this function call here
		int a = s.nextInt();
		for (int i = 1; i <= a; i++) {
			if (FizzBuzz(i) == null)
				System.out.print(i + " ");
			else
				System.out.print(FizzBuzz(i) + " ");
		}
	}

}
