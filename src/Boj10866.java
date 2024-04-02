import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Boj10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<String> deque = new ArrayDeque<>();

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			sol(br.readLine().split(" "), deque);
		}

	}

	private static void sol(String[] command, Deque<String> deque) {

		switch (command[0]) {
			case "push_front":
				deque.addFirst(command[1]);
				break;
			case "push_back":
				deque.addLast(command[1]);
				break;
			case "pop_front":
				System.out.println(deque.isEmpty() ? -1 : deque.pollFirst());
				break;
			case "pop_back":
				System.out.println(deque.isEmpty() ? -1 : deque.pollLast());
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				System.out.println(deque.isEmpty() ? 1 : 0);
				break;
			case "front":
				System.out.println(deque.isEmpty() ? -1 : deque.getFirst());
				break;
			case "back":
				System.out.println(deque.isEmpty() ? -1 : deque.getLast());
				break;
			default:
				break;
		}
	}
}
