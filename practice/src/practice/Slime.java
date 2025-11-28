package practice;

public class Slime extends Monster {

	public Slime(char suffix, int hp) {
		super(suffix, hp);
	}
	public String getName() {
		return "スライム" + suffix;
	}

	public void run() {
		System.out.println(getName() + "はササっと逃げた");
	}

	public void attack(Character c) {
		if(this.hp <= 0 ) return;
		System.out.println(getName() + "の毒攻撃！");
		System.out.println(c.name + "に3ポイントのダメージ！");
		c.hp -= 3;
	}
}
