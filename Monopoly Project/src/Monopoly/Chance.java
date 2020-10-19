package Monopoly;

public class Chance extends Space {
	String _name;
	static int _cardIndex = 0;     // creates a index with a value of zero
	public static final int MAX = 9;    // number of cards  

	public Chance(String name) {     // chance card constructor
		super(name);
		this._name = name;
	}

	public void action(Player player) {
		System.out.println("                   ");
		System.out.print("|Chance Card|");		
		System.out.println("                   ");
		System.out.println("                   ");
		_cardIndex = (int) ((Math.random() * MAX) + 1);
		switch (_cardIndex) {
		case 1:
			System.out.println("Take a ride on the Reading Railroad");
			System.out.println("                   ");
			player.move(5);
			System.out.println();
			System.out.println("                   ");

			break;
		case 2:
			System.out.println("Bank pays you dividend of $50");
			System.out.println("                   ");
			player.collect(50);
			break;
		case 3:
			System.out.println("Advance to Illinois Avenue");
			System.out.println("                   ");
			player.move(24);
			System.out.println();
			System.out.println("                   ");
			break;
		case 4:
			System.out.println("Your building and loan matures, Collect $150");
			System.out.println("                   ");
			player.collect(150);
			break;
		case 5:
			System.out.println("Get out of jail free card, Collect $50");
			System.out.println("                   ");
			player.collect(50);
			break;
		case 6:
			System.out.println("Pay poor tax of $15");
			System.out.println("                   ");
			player.pay(15);
			break;
		case 7:
			System.out.println("Take a walk on the Boardwalk");
			System.out.println("                   ");
			player.move(39);
			System.out.println();
			System.out.println("                   ");
			break;
		case 8:
			System.out.println("Advance to go, Collect $200 dollars");
			System.out.println("                   ");
			player.move(0);
			player.collect(200);
			System.out.println();
			System.out.println("                   ");
			break;
		case 9:
			System.out.println("Go directly to jail");
			System.out.println("                   ");
			player.move(10);
			player.pay(50);
			System.out.println(player.getName() + " paid $50 to get out of jail");
			System.out.println();
			System.out.println("                   ");
			break;
		}
	}

}
