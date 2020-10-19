package Monopoly;

public class Token {

	private int _position;

	public Token() { // token constructor
		this._position = 0;
	}

	public int getLocation() { // getter for token location
		return _position;
	}

	public void setLocation(int location) { // setter for token location
		this._position = location;
	}

	public void move(int diceRoll) {
		this._position += diceRoll;
		if (this._position > 39) {
			this._position -= 40;
		}

	}
}