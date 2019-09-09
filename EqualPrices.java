import java.util.Arrays;
import java.util.Scanner;

public class EqualPrices {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int a = scan.nextInt();
		int[] result = new int[a];
		for (int j = 0; j < a; j++) {
			int n = scan.nextInt();
			int k = scan.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = scan.nextInt();
			}
			int min = minAbsoluteDifference(array, k, n);
			result[j] = min;
		}
		for (int i : result) {
			System.out.println(i);
		}
	}

	private static int minAbsoluteDifference(int[] array, int k, int n) {
		int x, ans = -1;
		Arrays.sort(array);
        x = array[0] + k;
        if(x>=array[n-1]) ans = x;
        else{
            if((array[n-1]-x)<=k) ans = x;
        }
        return ans;
	}
}
