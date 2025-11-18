package ex4_4;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new java.util.Random().nextInt(10);
			if (i != 0) {
				while(numbers[i] == numbers[i - 1] ) {
					numbers[i] = new java.util.Random().nextInt(10);
				}
			}
		}
		
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int num : numbers) {
			if (input == num) {
				System.out.println("あたり!");
			}
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println("おわり");
	}
}

// これでは、添え字0 と 2の数字が被る可能性が