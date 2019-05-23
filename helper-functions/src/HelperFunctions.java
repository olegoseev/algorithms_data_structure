
import java.util.concurrent.ThreadLocalRandom;

public class HelperFunctions {

    public static int[] sortedArrayOfIntegers(int firstValue, int step, int arraySize) {
        if (step == 0) {
            step = 1;
        }
        int[] array = new int[arraySize];
        for (int i = firstValue; i < arraySize; i++) {
            array[i] = i * step;
        }
        return array;
    }

    public static int[] unsortedArrayOfIntegers(int firstValue, int step, int arraySize) {
        int[] array = sortedArrayOfIntegers(firstValue, step, arraySize);
        int j, temp;
        for(int i = 0; i < arraySize; i++) {
            j = ThreadLocalRandom.current().nextInt(i, arraySize);
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }

    public static int[] unsortedArrayOfIntegers(int arraySize) {
        return unsortedArrayOfIntegers(0, 1, arraySize);
    }

    public static void printArray(int[] array, int size) {
        for(int i = 0; i < size; i++) {
            if(i > 0 && i % 10 == 0) System.out.println();
            System.out.printf("%3d", array[i]);
        }
        System.out.println();
    }

}
