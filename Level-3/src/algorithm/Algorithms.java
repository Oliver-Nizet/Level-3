package algorithm;

import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		int x = 0;
		for (int i = eggs.size() - 1; i > -1; i--) {
			if (eggs.get(i).equals("cracked")) {
				x = i;
			}
		}
		return x;
	}

	public static int countPearls(List<Boolean> oysters) {
		int x = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				x++;
			}
		}
		return x;
	}

	public static double findTallest(List<Double> peeps) {
		double x = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > x) {
				x = peeps.get(i);
			}
		}
		return x;
	}

	public static Object findLongestWord(List<String> words) {
		String x = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > x.length()) {
				x = words.get(i);
			}
		}
		return x;
	}

	public static Object containsSOS(List<String> message1) {
		Boolean x = message1.contains(" ... --- ... ");
		return x;
	}

	public static List<String> sortScores(List<Double> results) {

		return null;
	}
}
