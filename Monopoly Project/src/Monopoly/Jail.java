package Monopoly;

public class Jail extends Space {
	String _name;

	public Jail(String name) {
		super(name);
		this._name = name;
	}

	public void action(Player player) {
		System.out.println("Don't worry " + player.getName() + ", you are just visiting");
		System.out.println("                   ");
	}
}
