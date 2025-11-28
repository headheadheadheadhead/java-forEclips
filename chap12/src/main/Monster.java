package main;

public abstract class Monster {
	int hp;
	int mp;
	char suffix;

	public Monster(char suffix, int hp) {
		this.suffix = suffix;
		this.hp = hp;
	}

	public abstract String getName();

	public abstract void attack(Character c);

	public abstract void run();
}
