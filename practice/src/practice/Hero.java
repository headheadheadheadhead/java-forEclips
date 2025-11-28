package practice;

public class Hero extends Character {

	public Hero(String name) {
		super(name);
	}

	@Override
	public void attack(Monster m){
		if(this.hp <= 0 ) return;
		System.out.println(this.name +"の攻撃！");
		System.out.println(m.getName() + "に15のダメージ！");
		m.hp -= 15;
	}
}
