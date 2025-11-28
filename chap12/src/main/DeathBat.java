package main;

public class DeathBat extends FlyingMonster {

	public DeathBat(char suffix, int hp) {
		super(suffix, hp);
	}

	@Override
	public void run() {
		System.out.println(getName() + "は羽ばたいて逃げ出した。");
	}

	@Override
	public String getName() {
		return "デスバット" + suffix;
	}
	@Override
	public void attack(Character c) {
		System.out.println(getName()+ "の" + c.name + "を突っつく攻撃！");
		c.hp -= 7;
	}
}
