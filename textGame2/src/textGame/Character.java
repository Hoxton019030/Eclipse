package textGame;

public abstract class Character {
	private String name;
	private int hp;
	private int atk;
	private int def;
	
	public abstract void atk();

	public Character() {}
	
	public Character(String name, int hp, int atk, int def) {
		setName(name);
		setHp(hp);
		setAtk(atk);
		setDef(def);
	}

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

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
}
