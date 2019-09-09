import java.util.Scanner;
public class SportMafia {
	
	static Scanner sc=new Scanner(System.in);
	public static void main (String[] args)	{
	    int n=sc.nextInt();
	    int k = sc.nextInt();
	    int add = 0, sub = 0, result = 0;
	    while(add + sub !=n) {
	    	add++;
	    	result += add;
	    	if(result > k)
	    		sub = result - k;
	    };
	    System.out.println(sub);
	}
}
