import java.util.Scanner;

/**
 * Optimized Naive Algorithm for Pattern Searching
 * 
 * @author tanmoy.tushar
 * @since 2019-07-07
 *
 */
public class PatternSearching {
	
	static Scanner sc = new Scanner(System.in);

	static int search(String txt, String ptrn) {
		int txtLen = txt.length();
		int ptrnLen = ptrn.length();
		int i = 0, count = 0;
		
		while (i <= txtLen - ptrnLen) {
			int j;
			for (j = 0; j < ptrnLen; j++) {
				if (txt.charAt(i + j) != ptrn.charAt(j)) break;				
			}
			if (j == ptrnLen) {
				System.out.println("Pattern Found at Index " + i);
				i += ptrnLen;
				count ++;
			}
			else if ( j == 0) i += 1;
			else i += j;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		String txt = sc.next();
		String pattern = sc.next();
		int total = search(txt, pattern);
		
		System.out.println("Total Pattern Found: " + total);
		
	}

}
