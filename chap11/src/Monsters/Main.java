package Monsters;

public class Main {

	public static void main(String[] args) {
		Goblin g = new Goblin('A', 100);
		DeathBat db = new DeathBat('A', 60);
		WereWolf ww = new WereWolf('A', 130);
		Hero h = new Hero("みなと", 100);

		g.attack(h);
		System.out.println(h.hp);
		db.attack(h);
		System.out.println(h.hp);
		ww.attack(h);
		System.out.println(h.hp);
		h.attack(g);
		System.out.println(g.hp);
		h.attack(ww);
		System.out.println(ww.hp);
		h.attack(db);
		System.out.println(db.hp);

		g.run();
		db.run();
		ww.run();

		h.run();
	}
}
