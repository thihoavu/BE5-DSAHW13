package coding.mentor.hwd13;

import java.util.Scanner;

public class Thefeast {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int c = scanner.nextInt();
		int m = scanner.nextInt();

		int result = 0;
		int chocolates = n / c;
		result += chocolates;
		while (chocolates >= m) {
			result += chocolates / m;
			chocolates = (chocolates / m) + (chocolates % m);
		}
		System.out.println(result);
	}
}
