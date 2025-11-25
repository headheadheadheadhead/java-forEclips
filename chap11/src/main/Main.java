package main;

public class Main {

	public static void main(String[] args) {

		Dancer d = new Dancer("あさか");
		Matango m = new Matango('A');
		d.dance();
		d.attack(m);
		d.run();

	}
}
