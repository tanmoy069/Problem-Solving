import java.util.*;

public class DividedArrayByEvenOdd {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       int n = sc.nextInt();

       String[] arr = new String[n];
       for(int i = 0; i < n; i++){
           arr[i] = sc.next();
       }
       everOddArray(arr);

    }
	private static void everOddArray(String[] arr) {
		int size = arr.length;
        for(int j = 0; j < size; j++){
        	String[] newArry = arr[j].split("");
            int size2 = newArry.length;
            String even = "", odd = "";
            for(int i = 0; i < size2; i++){
                if (i % 2 == 0) even += newArry[i];
                else odd += newArry[i];
            }
            System.out.println(even + " " + odd);
        }       
	}
}