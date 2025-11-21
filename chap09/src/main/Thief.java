package main;

public class Thief {
	String name;
	int hp;
	int mp;

	public Thief(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public Thief(String name, int hp) {
		this(name, hp, 5);
	}

	public Thief(String name) {
		this(name, 40, 5);

	}
}

// this(引数)を選択すると、コンストラクタ2, 3がコンストラクタ1を呼び出せる。
