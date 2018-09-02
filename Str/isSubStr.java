package Str;
/**
 * 判断是否为子序列
 * @author Administrator
 *
 */
public class isSubStr {
	public static boolean isSubsequence(String s,String t) {
		int index = -1;
		for (char c : s.toCharArray()) {
			index = t.indexOf(c, index+1);
			if (index == -1) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str1 = "abcy";
		String str2 = "dsabdascgc";
		System.out.println(isSubsequence(str1, str2));
	}
}
