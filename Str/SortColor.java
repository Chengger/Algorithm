package Str;
/**
 * ºÉÀ¼¹úÆìÎÊÌâ
 * @author Administrator
 *
 */

public class SortColor {
	public static int[] sortColors(int[] nums) {
		int left = -1,right = nums.length, index = 0;
		while (index < right) {
			if (nums[index] == 0) {
				swap(nums, ++left, index++);
			}else if (nums[index] == 2) {
				swap(nums, --right, index);
			}else {
				++index;
			}
		}
		return nums;
	}
	
	public static void swap(int[] nums,int i,int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	public static void main(String[] args) {
		int[] nums = new int[]{2,0,2,1,1,0};
		SortColor re = new SortColor();
		int[] res = re.sortColors(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(" "+res[i]); 
		}
		
	}
}
