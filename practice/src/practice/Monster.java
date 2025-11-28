package practice;

public abstract class Monster {
	int hp;
	char suffix;

	public abstract String getName();

	public Monster(char suffix, int hp) {
		this.hp = hp;
		this.suffix = suffix;
	}

	public abstract void run();

	public abstract void attack(Character c);
}
