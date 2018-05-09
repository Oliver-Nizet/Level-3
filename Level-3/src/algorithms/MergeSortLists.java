package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortLists {
	List<Integer> sort(List<Integer> unsorted) {
		if (unsorted.size() > 1) {
			List<Integer> a = new ArrayList<>();
			List<Integer> b = new ArrayList<>();
			int x = unsorted.size() / 2;
			for (int i = 0; i < x; i++) {
				a.add(unsorted.get(i));
			}
			for (int i = x; i < unsorted.size(); i++) {
				b.add(unsorted.get(i));
			}
			a = sort(a);
			b = sort(b);
			List<Integer> sorted = new ArrayList<>();
			int y = 0;
			int z = 0;
			while (sorted.size() < unsorted.size()) {
				if (y >= a.size()) {
					sorted.add(b.get(z));
					z++;
				} else if (z >= b.size()) {
					sorted.add(a.get(y));
					y++;
				} else if (a.get(y) < b.get(z)) {
					sorted.add(a.get(y));
					y++;
				} else {
					sorted.add(b.get(z));
					z++;
				}
			}
			return sorted;
		} else {
			return unsorted;
		}
	}

	public static void main(String[] args) {
		Integer[] unsorted = { 1, 4, 6, 3, 2, 8, 9 };
		List<Integer> l = Arrays.asList(unsorted);
		MergeSortLists s = new MergeSortLists();
		l = s.sort(l);
		for (int i = 0; i < l.size(); i++) {
			System.out.print(l.get(i) + " ");
		}
		System.out.println();
	}
}
