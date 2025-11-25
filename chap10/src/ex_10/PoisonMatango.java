package ex_10;

public class PoisonMatango extends Matango {
	int poisonAttack = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	@Override
	public void attack(Hero h) {
		super.attack(h);
		if (poisonAttack != 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			System.out.println((int)(h.hp * 0.2) + "ポイントのダメージ！");
			h.hp -= (int)(h.hp * 0.2);
			poisonAttack--;
		}
	}

	public String getName() {
		return "毒キノコ" + suffix;
	}
}
