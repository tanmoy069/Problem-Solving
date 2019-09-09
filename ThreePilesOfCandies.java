import java.util.Scanner;

public class ThreePilesOfCandies {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int test = sc.nextInt();
		for (int i = 0; i < test; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			
			long result = (a+b+c)/2;
			System.out.println(result);
		}		
	}
}
