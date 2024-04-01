import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj2581{

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		sol(n, m);

	}

	private static void sol(int n, int m) {
		int ans = -1;
		int sum = 0;

		if (m == 1) {
			System.out.println(ans);
			return;
		}

		for (int a = n; a <= m; a++) {
			if (isPrimary(a)) {
				if (ans == -1) {
					ans = a;
				}
				sum += a;
			}
		}

		if(sum != 0){
			System.out.println(sum);
		}
		System.out.println(ans);
	}

	private static boolean isPrimary(int number) {
		if(number == 1){
			return false;
		}
		if(number == 2){
			return true;
		}
		for (int i = 2; i < number / 2 + 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
