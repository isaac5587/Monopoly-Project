package Monopoly;

public class Die {
	public static final int MAX = 6;
	private int diceValue;

	public Die() {
		roll();
	}

	public void roll() { // roll method
		diceValue = (int) ((Math.random() * MAX) + 1); //random dice value range
		//diceValue = (int) (1);  //test dice value
	}

	public int getDiceValue() { // getter for the dice value rolled
		return diceValue;
	}
}