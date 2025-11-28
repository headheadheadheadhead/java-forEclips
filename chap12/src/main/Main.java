package main;

public class Main {
	public static void main(String[] args) {
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime('A', 50);
		monsters[1] = new Goblin('A', 50);
		monsters[2] = new DeathBat('A', 50);
		for (Monster m : monsters) {
			m.run();
		}
	}
}
