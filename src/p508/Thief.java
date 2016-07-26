package p508;

public class Thief extends Character {

	@Override
	public void attack(Monster m) {
		System.out.println(this.getName() + "の攻撃");
		System.out.println("敵に2ポイントのダメージ");
		m.setHp(m.getHp()-3);
	}

}
