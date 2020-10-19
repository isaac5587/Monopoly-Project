package Monopoly;

public class Player {
	private String name;
	private String tokenName;
	private Token piece;
	private int money;
	private Board board;
	private Die[] dice;

	public Player(String name, String tokenName, int money, Die[] dice, Board board) { // Player constructor
		this.name = name;
		this.tokenName = tokenName;
		this.money = money;
		money = 1600;
		this.dice = dice;
		this.board = board;
		piece = new Token(); // instantiates a token
	}

	public void takeTurn() { // take turn method
		// roll dice
		int rollTotal = 0;
		for (int i = 0; i < dice.length; i++) {
			dice[i].roll(); // moves by this number
			rollTotal += dice[i].getDiceValue();
		}
		System.out.print("+-------------------+\n" + "| " + this.name + "'s Turn      |\n" + "+-------------------+\n");
		System.out.println("                   ");
		System.out.println(this.name + " rolled a " + rollTotal);
		System.out.println("                   ");
		System.out.println(this.name + "'s " + this.tokenName + " moved " + rollTotal + " spaces");
		System.out.println("                   ");
		piece.move(rollTotal); // moves piece
		Space space = board.getPosition(piece.getLocation()); // get space player landed on
		System.out.println(this.name + " landed on " + space.getName());
		System.out.println("                   ");
		space.action(this); // have the space do the action on the player
		System.out.println("                   ");
		System.out.println(this.name + " has a total of " + "$" + money + " dollars");
		System.out.println("                   ");
	}

	public String getName() { // getter for name
		return name;
	}

	public void move(int position) { // method for moving the player based on position
		piece.setLocation(position);
	}

	public void pay(int amount) { // method for the player to pay an amount
		money -= amount;
	}

	public void collect(int amount) { // method for a player to receive an amount
		money += amount;
	}
	public int getMoney() {
		return money;
	}

}
