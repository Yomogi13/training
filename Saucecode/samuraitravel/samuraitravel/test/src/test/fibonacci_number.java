package test;

public class fibonacci_number {
	public static void main(String[] args) {
		int n = 10;

		long a = 0;
		long b = 1;

		System.out.println("フィボナッチ数列");
		System.out.println(a + " ");
		System.out.println(b + " ");

		for (int i = 2; i < n; i++) {
			long next = a + b;
			System.out.print(next + " ");
			a = b;
			b = next;
		}
	}
}
