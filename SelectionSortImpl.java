/**
 * In-place algorithm
 * 0(n^2) time complexity-quadratic
 * It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items...
 * Doesn't require as much swapping as bubble sort
 * Unstable algorithm
 */


public class SelectionSortImpl {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //Increasing the sorted partition by 1 from right to left
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0 ; lastUnsortedIndex--) {
            int largest = 0;

            //Looking for the largest element
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }


        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j]  = temp;
    }
}
