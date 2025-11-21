package main;

public class Main {

	public static void main(String[] args) {
		Sword s1 = new Sword();
		s1.name = "炎の剣";
		s1.damege = 10;

		Sword s2 = new Sword();
		s2.name = "光の剣";
		s2.damege = 15;

		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		h1.sword = s1;


		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
		h2.sword = s2;

		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;

		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		System.out.println(h1.name + " : " + h1.hp);
		System.out.println(h2.name + " : " + h2.hp);

		Thief t1 = new Thief("アサカ", 40, 5);
		Thief t2 = new Thief("ミナト", 35);
		Thief t3 = new Thief("スガワラ");

		System.out.println(t1.name + "  " + t1.hp + "  " + t1.mp);
		System.out.println(t2.name + "  " + t2.hp + "  " + t2.mp);
		System.out.println(t3.name + "  " + t3.hp + "  " + t3.mp);

	}
}









//Sword s = new Sword();
//s.name = "炎の剣";
//s.damege = 10;
//s.element = "frame";
//Hero h = new Hero();
//h.name = "ミナト";
//h.hp = 100;
//h.sword = s;
//System.out.println("現在の武器は" + h.sword.name);
//h.attack();
//if(h.sword.element.equals("frame")) {
//	int rnd = new java.util.Random().nextInt(10);
//	if (rnd >= 7) {
//		System.out.println("相手にやけどを負わせた！");
//	}
//}