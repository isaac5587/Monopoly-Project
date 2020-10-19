package Monopoly;

public class GoToJail extends Space {
	String _name;
	public GoToJail(String name) {
		super(name);
		this._name = name;
	}
	
public void action(Player player) {
		player.move(10);
		player.pay(50);
		System.out.println("                   ");
		System.out.println(player.getName() + " paid $50 to get out of jail");
	}

}
