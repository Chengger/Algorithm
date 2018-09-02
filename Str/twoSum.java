package Str;
/**
 * 一个有序数组，使某两个值的和等于一个目标值
 * @author Administrator
 *
 */
public class twoSum {
	public static int[] twoSumn(int[] arr,int target) {
		int i = 0,j = arr.length-1;
		while (i < j) {
			int num = arr[i]+arr[j];
			if (num == target) {
				return new int[]{i+1,j+1};
			}else if (num < target) {
				i++;
			}else{
				j--;
			}
		}
		return null;
	}
	public static void main(String[] args) {
		int[] a1 = new int[]{2,4,8,12,43};
		int target = 10;
		int[] a2 = twoSumn(a1, target);
		System.out.println("index1="+a2[0]+",index2="+a2[1]);
	}
}
