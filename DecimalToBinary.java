import java.util.Scanner;

/**
 * 
 * @author tanmoy.tushar
 * @since 2017-07-05
 *
 */
public class DecimalToBinary {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();		
		int result = consecutiveOne(n);
		System.out.println(result);		
	}
	
	static int consecutiveOne(int n) {
		int[] binaryNum = new int[32]; 
        int i = 0, count = 0, temp = 0; 
        while (n > 0) { 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        }
        for (int j = 0; j < i; j++) {
        	if(binaryNum[j] == 1) {
        		count++;
        		if(count > temp) temp = count;
        	}
        	else count = 0;
        }
        if(temp > 1) return temp;
        return 1;
	}
}
