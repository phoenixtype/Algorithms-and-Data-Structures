import java.io.*;
import java.util.ArrayList;
import java.util.List;

class CompareTriplets {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int valA = 0;
        int valB = 0;

        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < b.size(); j++) {
                if (i == j && a.get(i) > b.get(j)){
                    // System.out.println("hereA");
                    valA++;
                }
                if (i == j && a.get(i) < b.get(j)) {
                    // System.out.println("hereB");
                    valB++;
                }
            }
        }
        result.add(0, valA);
        result.add(1, valB);
        return result;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }

        List<Integer> result = CompareTriplets.compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
