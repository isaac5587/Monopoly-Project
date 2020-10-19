package Monopoly;

import java.util.Scanner;

public class RailRoad extends Space {
	String _name;
	int _price;
	int[] _rent;
	private Scanner objects;

	int _index;

	public RailRoad(String name, int price, int[] rent) {
		super(name);
		this._name = name;
		this._price = price;
		this._rent = rent;

	}

	public void action(Player player) {
		if (getOwner() != null) { // if there is an owner
			payPlayer(player); // pays the owner rent
			System.out.println(" You paid the railroad fee to owner !");
		} else {
			objects = new Scanner(System.in);
			String response;
			System.out.println("                   ");
			System.out.println(
					player.getName() + " would you like to purchase " + this._name + " for " + "$" + this._price + "?");
			System.out.println("                   ");
			System.out.println(" Yes or YES || No or NO");
			response = objects.nextLine();
			if (response.equals("yes") || response.equals("YES")) {
				player.pay(this._price);
				System.out.println("                   ");
				setOwner(player);
				System.out.println(player.getName() + " purchased " + this._name + " for " + "$" + this._price);

			} else if (response.equals("no") || response.equals("NO")) {
				System.out.println("                   ");
				System.out.println("No worries " + player.getName() + " maybe next time");
			}
		}

	}

	public void payPlayer(Player player) {
		player.pay(_rent[0]); // subtracts rent
		getOwner().collect(_rent[0]); // gives rent to owner

	}

}
