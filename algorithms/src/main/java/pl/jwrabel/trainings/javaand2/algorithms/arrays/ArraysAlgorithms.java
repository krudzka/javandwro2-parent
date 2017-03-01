package pl.jwrabel.trainings.javaand2.algorithms.arrays;

/**
 * Hello world!
 *
 */
public class ArraysAlgorithms
{
    public static void main( String[] args )
    {
        // === ZADANIE === metoda sumująca wartości w tablicy
        int[] array = {1,2,3,4,10,20};
//        int[] array = new int[]{1,2,3,4,10,20};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            sum = sum + element;
//            sum += element;

//            sum = sum + array[i];

        }



        System.out.println("Suma " + sum);
    }
}
