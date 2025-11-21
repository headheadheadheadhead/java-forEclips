package main;

public class Hero {
	String name = "ミナト";
	int hp = 100;

	// 以下、転ぶ
	public final void slip() {
	this.hp -= 5;
	System.out.println(this.name + "は転んだ");
	System.out.println("5のダメージ");
	}

	// 以下、戦う
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 10;
		System.out.println("10ポイントのダメージをあたえた");
	}

	//以下、逃げる

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}
}
