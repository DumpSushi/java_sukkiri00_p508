package p508;

public abstract class Character {
	private String name;
	private int hp;

	public abstract void attack(Monster m);
	public void run(){}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

}
