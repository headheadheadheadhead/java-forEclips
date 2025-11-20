package main;

//練習問題

public class Cleric {
	String name;
	int hp = 50;
	int mp = 10;
	final int MAX_HP = 50;
	final int MAX_MP = 10;

	public void selfAid() {
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println
			(this.name + "は、セルフエイドを使った！");
		System.out.println
			("HPが回復した！現在のHP" + this.hp);
		System.out.println("MPを5消費した");
	}
	/**
	 * 祈った秒数をもとにMPを回復する
	 * @param sec 秒を指定する
	 * @return 実際に回復したMP
	 */
	public int pray(int sec) {
		int oldMp = this.mp;
		int mpAid = new java.util.Random().nextInt(sec, sec + 3);
		this.mp = Math.min(oldMp + mpAid, MAX_MP);
		System.out.println(this.name + "は、" + sec + "秒祈った");
		System.out.println("MPが" + (this.mp - oldMp) + "回復した");
		return this.mp - oldMp;
	}
}
