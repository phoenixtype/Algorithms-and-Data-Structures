import java.io.*;
import java.util.Arrays;

class AlternatingCharacters {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {
        int count = 0;
        char[] charArray = s.toCharArray();
        char[] charArrayNext = s.toCharArray();

        char[] array2 = Arrays.copyOfRange(charArray, 0, 3);

        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == charArray[i - 1]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            int result = AlternatingCharacters.alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
