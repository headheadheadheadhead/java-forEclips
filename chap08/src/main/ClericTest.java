package main;

public class ClericTest {
	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "アサカ";
		System.out.println(c.name + "を生み出した！");

		c.selfAid();
		c.pray(1);
	}
}
