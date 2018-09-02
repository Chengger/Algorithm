package Sort;
/**
 * 桶排序之计数排序
 * @author Administrator
 * 适用于数据短的情况下
 */

public class BucketSort {
	public static void main(String[] args) {
		int[] test = generateRandomArray(20, 50);
		printArray(test);
		System.out.println("桶排序后：");
		bucketSort2(test);
		printArray(test);
	}
	 public static void bucketSort2(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		int[] bucket = new int[max+1];
		for (int i = 0; i < arr.length; i++) {
			bucket[arr[i]]++; //bucket[]为0~max的长度，遍历arr，如arr[0]=1,将其放入bucket[1],
					           //如arr[1]=1,再将其放入bucket[1],然后将bucket[1]中的值加一，即bucket[1]=2,以为着1这个数出现了2次。
		}
		int i = 0;
		for (int j = 0; j < bucket.length; j++) {
			while (bucket[j]-- > 0) {
				arr[i++] = j;//判断第j个bucket是否有值，有值的话将其输出到arr数组
			}
		}
		
	}
	 public static int[] generateRandomArray(int maxSize, int maxValue) {
			int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) ((maxValue + 1) * Math.random());
			}
			return arr;
		}
	 public static void printArray(int[] arr) {
			if (arr == null) {
				return;
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
}
