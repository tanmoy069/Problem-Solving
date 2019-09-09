import java.util.Scanner;

public class StickerAndToy {
	
	static int possibleOut(int totalE, int sticker, int toy) {
		if(sticker >= toy) return totalE - toy + 1;
		else return totalE - sticker + 1;
	}	
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int test = sc.nextInt();
		int totalEgg, s, t;
		int[] result = new int[test];
		for(int i = 0; i < test; i++) {
			totalEgg = sc.nextInt();
			s = sc.nextInt();
			t = sc.nextInt();
			result[i] = possibleOut(totalEgg, s, t);
		}
		for (int i : result) {
			System.out.println(i);
		}		
	}
}
