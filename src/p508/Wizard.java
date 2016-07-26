package p508;

public class Wizard extends Character {
	private int mp;

	@Override
	public void attack(Matango m)
	{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(this.getName() + "の攻撃");
		System.out.println("敵に3ポイントのダメージ");
		m.setHp(m.getHp()-3);
	}

	public void fireball(Matango m)
	{
		System.out.println(this.getName() + "は火の玉を放った");
		System.out.println("敵に20ポイントのダメージ");
		m.setHp(m.getHp()-20);
		this.setMp(this.getMp()-5);
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

}
