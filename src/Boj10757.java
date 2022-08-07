import java.io.*;
import java.util.StringTokenizer;

public class Boj10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");

        char a[] = tokenizer.nextToken().toCharArray();
        char b[] = tokenizer.nextToken().toCharArray();
        char c[] = new char[20000];

        int carry = 0;
        int aIndex = a.length - 1;
        int bIndex = b.length - 1;
        int cIndex = 0;

        while (true) {
            int num = (aIndex >= 0 ? Character.getNumericValue(a[aIndex--]) : 0) + (bIndex >= 0 ? Character.getNumericValue(b[bIndex--]) : 0) + carry;
            carry = 0;
            if (num >= 10) {
                carry = 1;
            }
            c[cIndex++] = (char) ((num % 10) + '0');
            if (aIndex < 0 && bIndex < 0) {
                if (carry == 1) {
                    c[cIndex] = (char) (carry + '0');
                } else {
                    cIndex--;
                }
                break;
            }
        }

        for (int i = cIndex; i >= 0; i--) {
            writer.write(c[i]);
        }
        writer.flush();
        writer.close();
    }
}