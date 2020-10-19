package Monopoly;

public class Space {
	private String _name;
	private Space _nextSquare;
	private Player _owner;
	

	public Space(String name) { // space constructor
		this._name = name;
		
	}

	public void setNextSquare(Space s) { // setter for the next space
		_nextSquare = s;
	}

	public Space getNextSquare() { // getter for the next space
		return _nextSquare;
	}

	public String getName() { // getter for space name
		return _name;
	}

	public int getIndex() {
		return 0; // gets the space index
	}
	
	public Player getOwner() {
		return _owner;		
	}
	public void setOwner(Player player) {
		_owner = player; 		
	}
	
	public void action(Player player) {
		
	}
	
}