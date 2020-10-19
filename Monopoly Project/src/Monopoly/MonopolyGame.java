package Monopoly;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

public class MonopolyGame {

	private static int ROUNDS_TOTAL = 200;
	private static final int PLAYERS_TOTAL = 2;
	private List players = new ArrayList(PLAYERS_TOTAL); // list of players
	private Board board = new Board(); // instantiates board
	private Die[] dice = { new Die(), new Die() }; // array for both die
	private boolean isPlaying;

	public MonopolyGame() {

		Scanner objects = new Scanner(System.in);
		System.out.println("Please enter Player One's name: ");
		String name1 = objects.nextLine();
		System.out.println("Please enter Player One's Token: ");
		String tokenName1 = objects.nextLine();
		Player p1;
		// Player p2;
		// Player p3;
		// Player p4;// creates player objects
		p1 = new Player(name1, tokenName1, 500, dice, board);
		players.add(p1);
		System.out.println("Please enter Player Two's name: ");
		String name2 = objects.nextLine();
		System.out.println("Please enter Player Two's Token: ");
		String tokenName2 = objects.nextLine();
		p1 = new Player(name2, tokenName2, 500, dice, board);
		players.add(p1);
		/*System.out.println("Please enter Player Three's name: ");
		String name3 = objects.nextLine();
		System.out.println("Please enter Player Three's Token: ");
		String tokenName3 = objects.nextLine();
		p1 = new Player(name3, tokenName3, 1600, dice, board);
		players.add(p1);
		System.out.println("Please enter Player Four's name: ");
		String name4 = objects.nextLine();
		System.out.println("Please enter Player Four's Token: ");
		String tokenName4 = objects.nextLine();
		p1 = new Player(name4, tokenName4, 1600, dice, board);
		players.add(p1);
*/
		// check every player for money
		// if they do add to counter
		// if counter = 1, then game over

	}

	public void playGame() { // runs the game rounds
		for (int i = 0; i < players.size(); i++) { // loop to check players money before rounds proceed
			int playerMoney = ((Player) players.get(i)).getMoney(); // check each player's money amount
			if (playerMoney >= 0) {
				for (int j = 1; j < ROUNDS_TOTAL + 1; j++) {
					System.out.println("-------------------");
					System.out.println("                   ");
					System.out.println("Round " + j);
					System.out.println("                   ");
					if (playerMoney <= 0) {
						players.remove(i);
					}
					playRound();
					
					
				}
			}
			else {
				System.out.println("The Game is Over");
			}
				
				

		}
		/*for (int j = 1; j < ROUNDS_TOTAL + 1; j++) {
			System.out.println("-------------------");
			System.out.println("                   ");
			System.out.println("Round " + j);
			System.out.println("                   ");
			playRound();
			
		}*/
	}

	public List getPlayers() { // getter for players
		return players;
	}

	private void playRound() { // allows players to take turns
		for (Iterator iter = players.iterator(); iter.hasNext();) { // iterator interface
			Player player = (Player) iter.next();
			player.takeTurn();
		}

	}

}
