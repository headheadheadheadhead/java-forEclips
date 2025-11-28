package practice;

public class Goblin extends Monster {

	public Goblin(char suffix, int hp) {
		super(suffix, hp);
	}
	public String getName() {
		return "ゴブリン" + suffix;
	}

	public void run() {
		System.out.println(getName() + "は腕を振って逃げた！");
	}

	public void attack(Character c) {
		if(this.hp <= 0 ) return;
		System.out.println(getName() + "の攻撃！");
		System.out.println(c.name + "の5ポイントのダメージ！");
		c.hp -= 5;
	}
}
