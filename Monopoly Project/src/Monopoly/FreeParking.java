package Monopoly;

public class FreeParking extends Space{

	public FreeParking() {
		super("Free Parking");

	}
	public void action(Player player) {
		System.out.println(player.getName() + " enjoy Free Parking !");
	}
}
