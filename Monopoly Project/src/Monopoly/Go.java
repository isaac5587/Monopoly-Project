package Monopoly;

public class Go extends Space {
	public Go() {
		super("Go");
	}
	public void action(Player player) {
		player.collect(200);
	}

}
