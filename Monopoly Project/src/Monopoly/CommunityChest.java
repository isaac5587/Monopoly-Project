package Monopoly;

import java.lang.Math;

public class CommunityChest extends Space {
	String _name;
	public static final int MAX = 14;
	static int _cardIndex;

	public CommunityChest(String name) {
		super(name);
		this._name = name;
	}

	public void action(Player player) {
		_cardIndex = (int) ((Math.random() * MAX) + 1);
		System.out.println("                   ");
		System.out.print("| Community Chest Card |");
		System.out.println("                   ");
		System.out.println("                   ");
		switch (_cardIndex) {
		case 1:
			System.out.println("Income Tax Refund, Collect $20");
			System.out.println("                   ");
			player.collect(20);
			break;
		case 2:
			System.out.println("You inherit $100!");
			System.out.println("                   ");
			player.collect(100);
			break;
		case 3:
			System.out.println("Xmas fund matures, Collect $100");
			System.out.println("                   ");
			player.collect(100);
			break;
		case 4:
			System.out.println("Advance to Go, Collect $200");
			System.out.println("                   ");
			player.move(0);
			player.collect(200);
			System.out.println();
			System.out.println("                   ");
			break;
		case 5:
			System.out.println("Bank Error in your favor, Collect $200");
			System.out.println("                   ");
			player.collect(200);
			break;
		case 6:
			System.out.println("Get out of jail free pass, Collect $50 for your pass");
			System.out.println("                   ");
			player.collect(50);
			break;
		case 7:
			System.out.println("Pay hospital $100");
			System.out.println("                   ");
			player.pay(100);
			break;
		case 8:
			System.out.println("Receive $25 for Services");
			System.out.println("                   ");
			player.collect(25);
			break;
		case 9:
			System.out.println("Go to to Jail");
			System.out.println("                   ");
			System.out.println(player.getName() + " paid $50 to get out of jail");
			player.move(10);
			player.pay(50);
			System.out.println();
			System.out.println("                   ");

			break;
		case 10:
			System.out.println("Pay school tax of $150");
			System.out.println("                   ");
			player.pay(150);
			break;
		case 11:
			System.out.println("Doctors Fee, Pay $50");
			System.out.println("                   ");
			player.pay(50);
			break;
		case 12:
			System.out.println("From sale of stock, You get $45");
			System.out.println("                   ");
			player.collect(45);
			break;
		case 13:
			System.out.println("Life insurance matures, Collect $100");
			System.out.println("                   ");
			player.collect(100);
			break;
		case 14:
			System.out.println("You have won second prize in a beauty contest, Collect $10");
			System.out.println("                   ");
			player.collect(10);
			break;
		}
	}
}