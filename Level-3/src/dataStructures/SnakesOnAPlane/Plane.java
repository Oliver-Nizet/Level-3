package dataStructures.SnakesOnAPlane;

import java.util.ArrayList;

public class Plane {
	ArrayList<Snake> snakes;

	Plane() {
		snakes = new ArrayList<Snake>();
		for (int i = 0; i < 100; i++) {
			Snake s = new Snake();
			snakes.add(s);
		}
	}

	public int totalVenom() {
		int venom = 0;
		return venom;
	}
}
