import java.io.*;

public class Boj10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String name = br.readLine();

        bw.write(name + "??!");
        bw.newLine();
        bw.flush();
    }
}
