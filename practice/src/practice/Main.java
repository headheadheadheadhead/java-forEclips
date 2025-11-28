package practice;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Character[] chs = new Character [2];
		Monster[] mrs = new Monster[2];
		chs[0] = new Hero("みなと");
		chs[1] = new Wizard("あさか");
		mrs[0] = new Goblin('A', 70);
		mrs[1] = new Slime('A', 40);

		Random r = new Random();
		int i = r.nextInt(2);
		int j = r.nextInt(2);
		battle(chs[i], mrs[j]);
		chs[i].attack(mrs[j]);
		if (chs[i].hp <= 0) System.out.println("負けた！");
		if (mrs[j].hp <= 0) mrs[j].run();
	}

	public static void battle(Character c, Monster m) {
		while(c.hp > 0 && m.hp > 0) {
			c.attack(m);
			if(m.hp <= 0) break;
			m.attack(c);
		}
	}
}
