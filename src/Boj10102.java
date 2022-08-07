import java.io.*;
import java.util.StringTokenizer;

public class Boj10102 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int a = 0, b = 0;
        String votes = reader.readLine();

        for (char c : votes.toCharArray()) {
            if (c == 'A') {
                a++;
            } else {
                b++;
            }
        }

        if (a > b) {
            write.write("A");
        } else if (a < b) {
            write.write("B");
        } else {
            write.write("Tie");
        }
        write.flush();
        write.close();
    }
}
