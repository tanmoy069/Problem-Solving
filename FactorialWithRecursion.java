import java.io.*;
import java.util.*;

/**
 * 
 * @author tanmoy.tushar
 * @since 2019-07-05
 *
 */
public class FactorialWithRecursion {

	static int factorial(int n) {
		if (n == 0) return 1;
		return n * factorial(n - 1);
	}

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		int n = scanner.nextInt();
		int result = factorial(n);
		System.out.println(result);
		scanner.close();
	}
}
