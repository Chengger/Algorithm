import java.util.Scanner;

public class tttt {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] a1 = new int[6];
		int[] a2 = new int[6];
		for (int i = 0; i < a1.length; i++) {
			a1[i] = scanner.nextInt();
		}
		for (int i = 0; i < a2.length; i++) {
			a2[i] = scanner.nextInt();
		}
	}
}
