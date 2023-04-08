/**
 * Problem Link: https://leetcode.com/problems/sort-array-by-parity/
 */
class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        // taking two list, one for even and another for odd type data
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        // initializing array which will retrun parity sorted data of array
        for(int i : nums) {
            if(i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
        int[] newArray = new int[nums.length];
        // adding even and odd data into two taken
        int count = 0;
        // first even data adding to newArray sequentially 
        for(int i : evenList) newArray[count++] = i;
        for(int i : oddList) newArray[count++] = i;
        // then return newArray
        return newArray;
    }
}
