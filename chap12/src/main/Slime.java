package main;

public class Slime extends WalkingMonster {

	public Slime(char suffix, int hp) {
		super(suffix, hp);
	}

	@Override
	public void run() {
		System.out.println(getName() + "は体をうねらせて逃げ出した。");
	}

	@Override
	public String getName() {
		return "スライム" + suffix;
	}
	@Override
	public void attack(Character c) {
		System.out.println(getName()+ "は" +c.name + "をナイフで斬りつけた！");
		c.hp -= 10;
	}
}
