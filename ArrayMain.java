import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 15;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

//        Scanner scanner = new Scanner(System.in);

        int index  = -1;

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == -21) {
                index = i;
                break;
            }
        }
//        for (int intnum: intArray) {
//            if (intArray[intnum] == 7) {
//                index = intnum;
//                break;
//            }
////            System.out.println(intnum);
//        }
        System.out.println(index);
    }
}
