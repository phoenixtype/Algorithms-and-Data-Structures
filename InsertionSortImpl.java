/**
 * In-place algorithm
 * 0(n^2) time complexity-quadratic
 * It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items...
 * Stable algorithm
 * May be characterised with alot of shifting
 */


public class InsertionSortImpl {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //Assumption: Element at position zero (0) is already sorted
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            //Save the value we're going to inster into a new element variable
            int newElement = intArray[firstUnsortedIndex];

            int i;

            //Looking for the position to insert new element
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
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
