package dataStructures.SnakesOnAPlane;

import java.util.Random;

public class Randomness {
	public static int viciousness() {
		Random r = new Random();
		int n = r.nextInt(10) + 1;
		return n;
	}

	public static boolean venomous() {
		Random r = new Random();
		int m = r.nextInt(9) + 1;
		boolean tf;
		if (m % 2 == 0) {
			tf = true;
		} else {
			tf = false;
		}
		return tf;
	}
}
