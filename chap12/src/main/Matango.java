package main;

public class Matango {
	int hp = 50;
	char suffix;

	public Matango(char suffix) {
		this.suffix = suffix;
	}

	public void attack (Character c) {
		System.out.println(getName() + "の攻撃");
		System.out.println("10のダメージ");
		c.hp -= 10;
	}

	public String getName() {
		return "キノコ" + suffix;
	}
}
