package pl.jwrabel.trainings.javaand2.algorithms.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jakubwrabel on 27.02.2017.
 */
public class Remainder {

	public static List<Integer> remainder(int x){
		int[] nominals = {10, 5, 2, 1};
		int nominalsIndex = 0;

		List<Integer> remainders = new ArrayList<>();

		while (x > 0){
			int currentNominal = nominals[nominalsIndex];
			if(x >= currentNominal){
				x -= currentNominal;
				remainders.add(currentNominal);
			} else {
				nominalsIndex++;
			}
		}

		return remainders;
	}

	public static List<Integer> remainderRecursive(int x){
		if(x <= 0){
			return new ArrayList<>();
		} else {
			int[] nominals = {10, 5, 2, 1};

			for (int nominal : nominals){
				if(nominal <= x){
					x -= nominal;
//					x = x - nomi1nal;


					List<Integer> list = new ArrayList<>();
					list.add(nominal);
					list.addAll(remainderRecursive(x));
					return list;

//					List<Integer> list1 = remainderRecursive(x);
//					list1.add(nominal);
//					return list1;
				}
			}

		}


		return new ArrayList<>();
	}

}
