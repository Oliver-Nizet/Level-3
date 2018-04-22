package dataStructures;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListPuzzles {

	public static void main(String[] args) {
		ArrayList<String> food = new ArrayListPuzzles().getFoodArray();
		ArrayList<String> joke = new ArrayListPuzzles().getJokeArray();
		ArrayList<String> punchline = new ArrayListPuzzles().getPunchlineArray();
		ArrayList<String> adjective = new ArrayListPuzzles().getAdjectiveArray();
		ArrayList<String> noun = new ArrayListPuzzles().getNounArray();
		ArrayList<Integer> overload = new ArrayListPuzzles().getOverloadArray();
		Random r = new Random();
		int f = r.nextInt(food.size());
		System.out.println("You should eat " + food.get(f) + " tonight.\n");
		int j = r.nextInt(joke.size());
		System.out.println(joke.get(j) + "\n --- " + punchline.get(j) + "\n");
		int a = r.nextInt(adjective.size());
		int n = r.nextInt(noun.size());
		System.out.println("Your brand name is " + adjective.get(a) + " " + noun.get(n) + ".\n");
		System.out.println(overload);
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

	public ArrayList<String> getAdjectiveArray() {
		ArrayList<String> adjective = new ArrayList<>();
		adjective.add("Dank");
		adjective.add("Ugly");
		adjective.add("Thicc");
		adjective.add("Stiff");
		adjective.add("Triggered");
		adjective.add("Delusional");
		return adjective;
	}

	public ArrayList<String> getNounArray() {
		ArrayList<String> noun = new ArrayList<>();
		noun.add("Memes");
		noun.add("Frogs");
		noun.add("V-Bucks");
		noun.add("Noobs");
		noun.add("Doggos");
		noun.add("Animal Crackers");
		return noun;
	}

	public ArrayList<Integer> getOverloadArray() {
		ArrayList<Integer> overload = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			overload.add(i);
		}
		return overload;
	}
}
