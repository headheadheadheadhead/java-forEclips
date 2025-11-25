package Monsters;

public class Hero extends Character {

	public Hero(String name) {
		super(name);
	}

	public Hero(String name, int hp) {
		super(name, hp);
	}

	@Override
	public void attack(Monster m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("15ポイントのダメージ！");
		m.hp -= 15;
	}
}