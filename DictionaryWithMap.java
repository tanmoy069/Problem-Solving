import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DictionaryWithMap {

	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Map<String, Integer> dic = new HashMap<>();
        int n = in.nextInt();
        String name=null;
        int phone = 0;
        for(int i = 0; i < n; i++){
            name = in.next();
            phone = in.nextInt();
            dic.put(name, phone);
        }
    	dic.entrySet().stream().collect(Collectors.toList()).forEach(System.out::println);
//        while(in.hasNext()) {
//        	match = in.nextLine();
//        }
        
	}

}
