package main;

public class Main {
	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		Matango m = new Matango('A');

		sh.attack(m);
		System.out.println(m.hp);
		sh.fly();
		sh.attack(m);
		System.out.println(m.hp);
	}

}
