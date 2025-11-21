package main2;

public class Hero {
	String name;
	int hp;

//ここにアタックを入れる

	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	public Hero() {
		this("ダミー");
	}
}
