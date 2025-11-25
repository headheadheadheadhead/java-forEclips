package ex_10;

public class Main {
	public static void main(String[] args) {

		Hero h = new Hero();
		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		pm.attack(h);
		System.out.println("現在勇者は" + h.hp);
	}
}
