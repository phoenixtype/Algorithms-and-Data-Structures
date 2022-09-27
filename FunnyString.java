import java.util.Arrays;
import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        isFunny();



    }

    public static Boolean isFunny() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string here to see if it is funny: ");
        String isFunny = scan.nextLine();
        char[] charArray = isFunny.toCharArray();

        System.out.println("charArray: ");
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        int[] intArray = new int[isFunny.length()];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = charArray[i];
        }

        System.out.println("IntArray: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        System.out.println("diffArray: ");
        int[] diffArray = new int[intArray.length - 1];
        for (int i = 1; i < intArray.length; i++) {
            diffArray[i-1] = Math.abs(intArray[i] - intArray[i - 1]);
            System.out.println(diffArray[i-1]);
        }

        int[] intArrayReverse = intArray;

        for (int i = 0; i < intArrayReverse.length/2; i++) {
            int temp = intArrayReverse[i];
            intArrayReverse[i] = intArrayReverse[intArrayReverse.length - 1 - i];
            intArrayReverse[intArrayReverse.length - 1 - i] = temp;
        }

        System.out.println("IntArrayReverse: ");
        for (int i = 0; i < intArrayReverse.length; i++) {
            System.out.println(intArrayReverse[i]);
        }

        System.out.println("diffArrayReverse: ");
        int[] diffArrayReverse = new int[intArrayReverse.length - 1];
        for (int i = 1; i < intArrayReverse.length; i++) {
            diffArrayReverse[i-1] = Math.abs(intArrayReverse[i] - intArrayReverse[i - 1]);
            System.out.println(diffArrayReverse[i-1]);
        }

        if (Arrays.equals(diffArray, diffArrayReverse)) {
            System.out.println("funny");
            return true;
        }

        System.out.println("not funny");
        return false;
    }
}
