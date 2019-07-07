/**
 * A recursive solution for subset sum
 * 
 * @author tanmoy.tushar
 * @since 2019-07-07
 *
 */
public class SubsetSum {
	
	/**
	 * @return true if sum of set[i] and set[i + 1] equal sum
	 */
	static boolean isSubsetSum(int[] set, int len, int sum) {
		
		if (sum == 0) return true;
		
		if (len == 0 && sum != 0) return false;
		
		if (set[len - 1] > sum) return isSubsetSum(set, len - 1, sum);
		
		return isSubsetSum(set, len - 1, sum) || isSubsetSum(set, len - 1, sum - set[len - 1]);
	}

	public static void main(String[] args) {
		
		int[] set = {3 , 4 , 9 , 11, 15, 8, 2};
		int sum = 26;
		int len = set.length;
		
		if (isSubsetSum(set, len, sum)) System.out.println("Found a subset with given sum");
		else System.out.println("No subset with given sum");

	}

}
