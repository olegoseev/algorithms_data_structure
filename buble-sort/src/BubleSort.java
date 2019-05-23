import java.util.Arrays;

public class BubleSort {

    public int sort(int[] array, int size) {

        boolean swapped = false;
        int temp;
        int iterations = 0;
        do{
            swapped = false;
            for (int i = 1; i < size; i++) {
                iterations++;
                if(array[i - 1] > array[i]){
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    swapped = true;
                }
            }
        }while(swapped);
        return iterations;
    }

    public int sortImproved(int[] array, int size) {
        int temp;
        int iterations = 0;
        int n = size;
        do{
            for (int i = 1; i < n; i++) {
                iterations++;
                if(array[i - 1] > array[i]){
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                }
            }
            n--;
        }while(n > 0);
        return iterations;
    }

    public static void main(String[] args) {
        int size = 100;
        int[] array = HelperFunctions.unsortedArrayOfIntegers(size);
        int[] arrayCopy = Arrays.copyOf(array, size);

        System.out.println("Unsorted array");
        HelperFunctions.printArray(array, size);

        BubleSort bs = new BubleSort();
        int iterations = bs.sort(array, size);

        System.out.println("Sorted array");
        HelperFunctions.printArray(array, size);
        System.out.println("Number of iterations: " + iterations);

        System.out.println("\n===================================");
        System.out.println("Unsorted array");
        HelperFunctions.printArray(arrayCopy, size);

        BubleSort bs2 = new BubleSort();
        int iterations2 = bs2.sortImproved(arrayCopy, size);

        System.out.println("Sorted array");
        HelperFunctions.printArray(arrayCopy, size);
        System.out.println("Number of iterations: " + iterations2);

        System.out.format("Number of iterations\nOriginal Buble sort: %d\nImproved Buble sort: %d", iterations, iterations2);
    }
}
