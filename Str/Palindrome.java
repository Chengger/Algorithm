package Str;

import java.util.Scanner;


public class Palindrome {
	public static void main(String[] args) {
		int n;
		System.out.println("������һ��������");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		if (isPalindrome(n)) {
			System.out.println(n+"�ǻ���!");
		}else {
			System.out.println(n+"���ǻ���!");
		}
	}

	public static boolean isPalindrome(int n) {
		int m = reverse(n);
		if (m == n) {
			return true;
		}else {
			return false;
		}
		
	}

	public static int reverse(int i) {
		int s,j=0;
		s = i;
		while (s != 0) {
			j = j * 10+s%10;
			s = s/10;
		}
		return j;
	}
}
