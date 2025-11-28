package main;

public class Hero {
	private int hp;
	String name;
	Sword sword;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}
}
