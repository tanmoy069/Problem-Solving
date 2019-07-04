package DataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author tanmoy.tushar
 * @since 2019-07-04
 *
 */
public class ComparingMapAndList {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		Map<String, Integer> conPhone = new HashMap<>();
		List<String> con = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			
			conPhone.put(sc.next(), sc.nextInt());
		}
		int i = 0;
		while(i++ != n) {
			String match = sc.next();
			if(conPhone.containsKey(match)) con.add(match + "=" + conPhone.get(match));
			else con.add("Not found");
		}
		
		for (String string : con) {
			System.out.println(string);
		}
	}
}
