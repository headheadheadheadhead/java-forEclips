package main;

public abstract class FlyingMonster extends Monster {

	public FlyingMonster(char suffix, int hp) {
		super(suffix, hp);
	}

	@Override
	public void run() {
		System.out.println(getName() + "はバサバサ飛んで逃げる");
	}
}
