package Sort;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = generateRandomArray(20, 50);
		printArray(arr);
		System.out.println("≈≈–Ú∫Û£∫");
		mergerSort(arr);
		printArray(arr);
	}
	public static void mergerSort(int[] nums) {
		if (nums == null || nums.length < 2) {
			return;
		}
		mergerSort(nums,0,nums.length-1);
	}
	private static void mergerSort(int[] nums, int l, int r) {
		if (l == r) {
			return;
		}
		int mid = l+((r-l) >> 2);
		mergerSort(nums, l, mid);
		mergerSort(nums, mid+1, r);
		merge(nums, l, mid, r);
	}
	public static void merge(int[] nums,int l,int m,int r) {
		int[] help = new int[r-l+1];
		int i = 0;
		int p1 = l;
		int p2 = m+1;
		while (p1 <= m && p2 <= r) {
			help[i++] = nums[p1] < nums[p2] ? nums[p1++]:nums[p2++];
		} 
		while (p1 <= m) {
			help[i++] = nums[p1++];
		}
		while (p2 <= r) {
			help[i++] = nums[p2++];
		}
		for (int j = 0; j < help.length; j++) {
			nums[j+l] = help[j];
		}
	}
	public static void swap(int[] nums,int i,int j) {
		int temp = nums[i];
		nums[j] = nums[i];
		nums[j] = temp;
	}
	public static int[] generateRandomArray(int maxSize, int maxValue) {
		int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
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
