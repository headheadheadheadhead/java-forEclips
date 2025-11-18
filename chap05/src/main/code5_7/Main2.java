package main.code5_7;

public class Main2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("数字を入力してください");
		int inputNum = new java.util.Scanner(System.in).nextInt();
		printTotal(inputNum);
	}
	public static void printTotal(int Num) {
		int ans = 0;
		for (int i = 1; i <= Num; i++) {
			if (i == 3) {
				System.out.println("あきた");
				return;	
			}
		}
		System.out.println(ans);
	}
}
