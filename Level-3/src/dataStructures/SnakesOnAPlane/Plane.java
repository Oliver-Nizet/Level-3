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

	public static void main(String[] args) {
		Plane plane = new Plane();
		System.out.println(plane.totalVenom());
	}

	public int totalVenom() {
		int venom = 0;
		for (int i = 0; i < snakes.size(); i++) {
			if (snakes.get(i).isVenomous()) {
				venom += snakes.get(i).getViciousness();
			}
		}
		return venom;
	}
}
