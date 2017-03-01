package pl.jwrabel.trainings.javaand2.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 25.02.2017.
 */
public class Recursion {
	// suma liczb 1..X

	public static int sum(int x) {
//		int y = 0;
//		if (x >= 1) {
//			y = x + sum(x - 1);
//		}
//		return y;
//

//		if(x > 1){
//			return x + sum(x-1);
//		} else {
//			return 1;
//		}

		return x > 1 ? x + sum(x - 1) : 1;
	}

	// X-ty element ciągu fibonacciego
//	public static int fib(int x) {
//		if (x < 3) {
//			return 1;
//		} else {
//			return fib(x - 1) + fib(x - 2);
//		}
//	}

	public static List<Integer> fib(int x) {
		if (x == 1) {
			List<Integer> list = new ArrayList<>();
			list.add(1);
			return list;
		} else if (x == 2) {
			List<Integer> list = new ArrayList<>();
			list.add(1);
			list.add(1);
			return list;
		} else {
			List<Integer> fibPrevious = fib(x - 1);
			int lastElem = fibPrevious.get(fibPrevious.size() - 1); // X-1
			int preLastElem = fibPrevious.get(fibPrevious.size() - 2); // X-2

			int currentElement = lastElem + preLastElem;

			fibPrevious.add(currentElement);

			return fibPrevious;
		}

	}

	/*
		1. https://wikimedia.org/api/rest_v1/media/math/render/svg/992c1e408693a70235b67f389a33ab796aaef613
		2. List<Integer> fib(x), list.addAll(list2)
		3. Zwracanie reszty
		4. Zwracanie reszty - rekurencyjnie
	 */
}
