import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj5681 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] inputArray = Arrays.stream(br.readLine().split(" "))
								 .mapToInt(Integer::parseInt)
								 .sorted().toArray();

		sol(n, inputArray);
	}

	private static void sol(int n, int[] inputs) {

		int[] ans = new int[10000];
		int ansIndex = 0;

		for (int i = 1; i <= inputs[0]; i++) {
			if (inputs[0] % i == 0) {
				ans[ansIndex++] = i;
			}
		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < ansIndex; j++) {
				if (inputs[i] % ans[j] != 0) {
					ans[j] = -1;
				}
			}
		}
		for (int i = 0; i < ansIndex; i++) {
			if (ans[i] != 0 && ans[i] != -1) {
				System.out.println(ans[i]);
			}
		}
	}
}
