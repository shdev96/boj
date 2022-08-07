import java.io.*;

public class Boj2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        int three = n * (m % 100 % 10);
        int four = n * (m % 100 / 10);
        int five = n * (m / 100);
        int six = n * m;

        writer.write(three + "\n");
        writer.write(four + "\n");
        writer.write(five + "\n");
        writer.write(six + "\n");

        writer.flush();
        writer.close();
    }
}
