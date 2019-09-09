import java.util.Scanner;

public class LettersShop {

	static int lettersShop(String s, String cmp, int len) {
		int max = 0;
		if(s.length() > len)  System.out.println(max);
		String[] totalStr = s.split("");
		String[] totalCmp = cmp.split("");
		for (int i = 0; i < totalCmp.length; i++) {
			for (int j = 0; j < len; j++) {
				if(totalCmp[i].equalsIgnoreCase(totalStr[j])) {
					int count = 0;
					count = j + 1;
					if(count > max) max = count;
					break;
				}
			}
		}		
		return max;
	}	

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int len = sc.nextInt();
		String s = sc.next();
		int test = sc.nextInt();
		String sec;
		int[] result = new int[test];
		for(int i = 0; i < test; i++) {
			sec = sc.next();
			result[i] = lettersShop(s, sec, len);	
		}
		for (int i : result) {
			System.out.println(i);
		}	
		
	}

}
