package Str;

import java.util.Arrays;
import java.util.HashSet;
/**
 * 反转字符串中的元音字符
 * s="leetcode";res="leotcede";
 * @author Administrator
 *
 */
public class ReverseVolwels {
	private final static  HashSet<Character> vowels = new HashSet<>(
			Arrays.asList('a','e','i','o','u','A','E','I','O','U')) ;
		
	public static String reverseVowelsStr(String s) {
		int i = 0, j = s.length()-1;
		char[] res = new char[s.length()];
		while (i <= j) {
			char c1 = s.charAt(i);
			char j1 = s.charAt(j);
			if (!vowels.contains(c1)) {
				res[i++] = c1;
			}else if (!vowels.contains(j1)) {
				res[j--] = j1;
			}else {
				res[i++] = j1;
				res[j--] = c1;
			}
		}
		return new String(res);
	}
}
