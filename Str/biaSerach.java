package Str;
/**
 * ¶ş·Ö²éÕÒ
 * @author Administrator
 *
 */
public class biaSerach {
	public static int binarySearch(int[] nums,int key) {
		int l = 0,r = nums.length-1;
		while (l < r) {
			int m = l +(r-l)/2;
			if (nums[m] == key) {
				return m;
			}else if (nums[m] > key) {
				r = m-1;
			}else {
				l = l+1;
			}
		}
		return -1;
	}

}
