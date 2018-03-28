package dataStructures;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPuzzles {

	public static void main(String[] args) {
		ArrayList<String> food = new ArrayListPuzzles().getFoodArray();
		ArrayList<String> joke = new ArrayListPuzzles().getJokeArray();
		ArrayList<String> punchline = new ArrayListPuzzles().getPunchlineArray();
		Random r = new Random();
		int f = r.nextInt(food.size());
		System.out.println("You should eat " + food.get(f) + " tonight.\n");
		int j = r.nextInt(joke.size());
		System.out.println(joke.get(j) + "\n --- " + punchline.get(j) + "\n");
	}

	public ArrayList<String> getFoodArray() {
		ArrayList<String> food = new ArrayList<>();
		food.add("doritos");
		food.add("dino nuggets");
		food.add("minecraft crackers");
		food.add("gorilla poop");
		food.add("PS4 controllers");
		food.add("tide pods");
		return food;
	}

	public ArrayList<String> getJokeArray() {
		ArrayList<String> joke = new ArrayList<>();
		joke.add("What is black, white, and drooly?");
		joke.add("What is really sad?");
		joke.add("Want to hear a joke about paper?");
		joke.add("What do you call cheese that isn't yours?");
		joke.add("What is red and smells like blue paint?");
		joke.add("What is brown and sticky?");
		return joke;
	}

	public ArrayList<String> getPunchlineArray() {
		ArrayList<String> punchline = new ArrayList<>();
		punchline.add("A penguin with rabies.");
		punchline.add("Your social life.");
		punchline.add("Nevermind it's tearable.");
		punchline.add("Nacho cheese.");
		punchline.add("Red paint.");
		punchline.add("A stick.");
		return punchline;
	}
}
