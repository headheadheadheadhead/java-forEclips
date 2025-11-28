package useinterface;

public abstract class Monster {
	int hp;
	int mp;
	char suffix;

	public Monster(char suffix, int hp) {
		this.suffix = suffix;
		this.hp = hp;
	}

	public abstract String getName();

	// public abstract void attack(Character c);

	public void setRunnable(Runnable runnable) {
		this.runnable = runnable;
	}

	public void run() {
		this.runnable.run();
	}
}
