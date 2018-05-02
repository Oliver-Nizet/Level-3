package dataStructures.SnakesOnAPlane;

public class Snake {
	int viciousness;
	boolean venomous;

	public static void main(String[] args) {
		Snake Snake = new Snake();
	}

	Snake() {
		viciousness = Randomness.viciousness();
		venomous = Randomness.venomous();
	}

	public int getViciousness() {
		return viciousness;
	}

	public boolean isVenomous() {
		return venomous;
	}
}
