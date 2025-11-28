package main;

public abstract class WalkingMonster extends Monster {

	public WalkingMonster(char suffix, int hp) {
		super(suffix, hp);
	}

	@Override
	public void run() {
		System.out.println(getName() + "はトコトコ走って逃げる");
	}

}
