package p508;

public class Hero extends Character {

	@Override
	public void attack(Monster m) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.getName() + "の攻撃");
		System.out.println("敵に5ポイントのダメージ");
		m.setHp(m.getHp()-3);
	}

}
