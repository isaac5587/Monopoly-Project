package Monopoly;

public class Tax extends Space {
	public Tax(String name) {
		super(name);

	}
	public void action(Player player) {
		System.out.println("                   ");
		System.out.println("Unfortunately you have to pay a tax fee of $200");
		player.pay(200);
	}

}
