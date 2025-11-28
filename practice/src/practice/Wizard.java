package practice;

public class Wizard extends Character {

	public Wizard(String name) {
		super(name);
	}

	public void attack(Monster m) {
		if(this.hp <= 0 ) return;
		System.out.println(this.name + "の攻撃！");
		System.out.println(m.getName() + "に6のダメージ！");
		m.hp -= 6;
	}
}
