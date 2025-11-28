package useinterface;

public class Goblin extends Monster {

	public Goblin(char suffix, int hp) {
		super(suffix, hp);
	}

	@Override
	public String getName() {
		return "ゴブリン" + suffix;
	}
}