import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj10828 {
	public static void main(String[] args) throws IOException {
		Stack<String> stack = new Stack<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			sol(stack, br.readLine().split(" "));
		}
	}

	private static void sol(Stack<String> stack, String[] command) {
		if (command[0].equals("push")) {
			stack.push(command[1]);
			return;
		}

		if (command[0].equals("pop")) {
			if (stack.empty()) {
				System.out.println(-1);
				return;
			}

			System.out.println(stack.pop());
			return;
		}

		if (command[0].equals("size")) {
			System.out.println(stack.size());
			return;
		}

		if (command[0].equals("empty")) {
			System.out.println(stack.empty() ? 1 : 0);
			return;
		}

		if (command[0].equals("top")) {
			if (stack.empty()) {
				System.out.println(-1);
				return;
			}
			System.out.println(stack.peek());
		}

	}
}
