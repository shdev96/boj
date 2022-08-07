import java.io.*;
import java.util.StringTokenizer;

public class Boj2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        int arr[] = new int[n];

        tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(tokenizer.nextToken());
        }

        solve(arr, m, bufferedWriter);
        bufferedWriter.close();
    }

    private static void solve(int[] arr, int m, BufferedWriter bufferedWriter) throws IOException {
        int max = -1234567890;
        int temp = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    temp = Math.max(max, arr[i] + arr[j] + arr[k]);
                    if (temp <= m) {
                        max = temp;
                    }
                }
            }
        }
        bufferedWriter.write(max + "");
        bufferedWriter.flush();
    }
}
