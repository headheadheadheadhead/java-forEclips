package Monsters;

public class WereWolf extends WalkingMonster {

	public WereWolf(char suffix, int hp) {
		super(suffix, hp);
	}

	@Override
	public String getName() {
		return "ワーウルフ" + suffix;
	}
	@Override
	public void attack(Character c) {
		System.out.println(getName() + "の" +c.name + "にかみつく攻撃！");
		c.hp -= 15;
	}
}
