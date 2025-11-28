package main;

public class Goblin extends WalkingMonster {

	public Goblin(char suffix, int hp) {
		super(suffix, hp);
	}

	@Override
	public void run() {
		System.out.println(getName() + "は腕をふって逃げ出した。");
	}

	@Override
	public String getName() {
		return "ゴブリン" + suffix;
	}
	@Override
	public void attack(Character c) {
		System.out.println(getName()+ "は" +c.name + "をナイフで斬りつけた！");
		c.hp -= 10;
	}
}
