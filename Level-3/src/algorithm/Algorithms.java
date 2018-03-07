package algorithm;

import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> eggs) {
		int x = 0;
		for (int i = eggs.size() - 1; i > -1; i--) {
			if (eggs.get(i).equals("cracked")) {
				x = i;
			} else {

			}
		}
		System.out.println("#1:" + x);
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int x = 0;
		for (int i = 0; i > oysters.size(); i++) {
			if (oysters.get(i).equals("true")) {
				x++;
			} else {

			}
		}
		System.out.println("#2:" + x);
		return 0;
	}

}
