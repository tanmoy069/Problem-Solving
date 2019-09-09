import java.util.Scanner;

public class FindingPower {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			int n, p;
			n = sc.nextInt(); p = sc.nextInt();
			if(n < 0 || p < 0) System.out.println("n and p should be non-negative");
			else {
				System.out.println((int) Math.pow(n, p));
			}
		}
	}
}
