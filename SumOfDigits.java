import java.util.Scanner;

public class SumOfDigits {

	static int sumOfDigits(int n) {
		int sum = 0;
		while (n > 0) {
			sum = sum + n % 10;
            n /= 10;
		}
		return sum;
	}
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n, sum, temp;
		n = sc.nextInt();
		temp = n;
		sum = sumOfDigits(n);
		if(sum % 4 == 0) {
			System.out.println(temp);
		}
		else if(sum % 4 != 0) {
			int temp2;
			sum = sum % 4;
			sum = 4 - sum;
			temp += sum;
			temp2 = temp;
			sum = sumOfDigits(temp);
			if(sum % 4 == 0) {
				System.out.println(temp2);
			}
			else {
				sum = sum % 4;
				sum = 4 - sum;
				temp += sum;
				System.out.println(temp);
			}
		}
	}	

}
