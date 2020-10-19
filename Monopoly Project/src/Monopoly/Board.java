package Monopoly;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private static final int SIZE = 40; // array size
	private Space[] spaces;   // array for board spaces

	public Board() {
		buildSquares(); // builds spaces
	}

	public Space getPosition(int position) {   // method to get the position 
		return this.spaces[position];     // finds the position from the this.space array
	}

	public Space getStartSquare() { // gets first space on the board
		return spaces [0];
	}

	private void buildSquares() { // builds all the spaces on the board	with elements
		this.spaces = new Space [] { 
		               new Go(),
		               new Property("Brown","Mediterranean", 60,new int[] { 2,  10,  30,   90,  160,  250}, 50),
		               new CommunityChest("Community Chest"),
		               new Property("Brown","Baltic Avenue", 60,new int[] { 4,  20,  60,  180,  320,  450}, 50),
		               new Tax("Income Tax"),
		               new RailRoad("Reading Railroad", 200, new int[] {25, 50, 100, 200}),
		               new Property("Cyan","Oriental Avenue", 100, new int[] { 6,  30,  90,  270,  400, 550}, 50),
		               new Chance("Chance Cards"),
		               new Property("Cyan","Vermont Avenue", 100, new int[] { 6,  30,  90,  270,  400,  550}, 50),
		               new Property("Cyan","Connecticut Avenue", 120, new int[] {8,  40, 100,  300,  450,  600}, 50),
		               new Jail("Jail"),
		               new Property("Magenta","St. Charles Place", 140, new int[] {10,  50, 150,  450,  625,  750}, 100),
		               new Utility("Electric Company", 150),
		               new Property("Magenta","States Avenue", 140, new int[] {10,  50, 150,  450,  625,  750}, 100),
		               new Property("Magenta","Virginia Avenue", 160, new int[] {12,  60, 180,  500,  700,  900}, 100),
		               new RailRoad("Pennsylvania Railroad", 200, new int[] {25, 50, 100, 200}),
		               new Property("Orange","St. James Place", 180, new int[] {14,  70, 200,  550,  750,  950}, 100),
		               new CommunityChest("Community Chest"),
		               new Property("Orange","Tennessee Avenue", 180, new int[] {14,  70, 200,  550,  750,  950}, 100),
		               new Property("Orange", "New York Avenue", 200, new int[] {16,  80, 220,  600,  800, 1000}, 100),
		               new FreeParking(),
		               new Property("Red","Kentucky Avenue", 220, new int[] {18,  90, 250,  700,  875, 1050}, 150),
		               new CommunityChest("Community Chest"),
		               new Property("Red","Indiana Avenue", 220, new int[] {18,  90, 250,  700,  875, 1050}, 150),
		               new Property("Red","Illinois Avenue", 240, new int[] {20, 100, 300,  750,  925, 1150}, 150),
		               new RailRoad("B. & O. Railroad", 200, new int[] {25, 50, 100, 200}),
		               new Property("Yellow","Atlantic Avenue", 260, new int[] {22, 110, 330,  800,  975, 1150}, 150),
		               new Property("Yellow","Ventnor Avenue", 260, new int[] {22, 110, 330,  800,  975, 1150}, 150),
		               new Utility("Water Works", 150),
		               new Property("Yellow","Marvin Gardens", 280, new int[] {24, 120, 360,  850, 1025, 1200}, 150),
		               new GoToJail("Go To Jail"),
		               new Property("Green","Pacific Avenue", 300, new int[] {26, 130, 390,  900, 1100, 1275}, 200),
		               new Property("Green","North Carolina Avenue", 300, new int[] {26, 130, 390,  900, 1100, 1275}, 200),
		               new CommunityChest("Community Chest"),
		               new Property("Green","Pennsylvania Avenue", 320, new int[] {28, 150, 450, 1000, 1200, 1400}, 200),
		               new RailRoad("Short Line Railroad", 200, new int[] {25, 50, 100, 200}),
		               new Chance("Chance Cards"),
		               new Property("Blue","Park Place", 350, new int[] {35, 175, 500, 1100, 1300, 1500}, 200),
		               new Tax("Luxury Tax of 100"),
		               new Property("Blue","Board Walk", 400, new int[] {50, 200, 600, 1400, 1700, 2000}, 200),
		};
		
		
		
	}
}
