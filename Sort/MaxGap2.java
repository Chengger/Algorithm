package Sort;


public class MaxGap2 {
	public static void main(String[] args) {
		int[] nums = generateRandomArray(20, 50);
		printArray(nums);
		int gap = maxGap(nums);
		System.out.println(gap);
	}
	public static int maxGap(int[] nums) {
		if (nums == null || nums.length < 2) {
			return 0;
		}
		int len = nums.length;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < len; i++) {
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[i]);
		}
		if (min == max) {
			return 0;
		}
		boolean[] hasNum = new boolean[len+1];
		int[] mins = new int[len+1];
		int[] maxs = new int[len+1];
		int bucket_id = 0;
		for (int i = 0; i < len; i++) {
			bucket_id = bucket(nums[i],len,min,max);
			mins[bucket_id] = hasNum[bucket_id] ? Math.min(mins[bucket_id], nums[i]) : nums[i];
			maxs[bucket_id] = hasNum[bucket_id] ? Math.max(maxs[bucket_id], nums[i]) : nums[i];
			hasNum[bucket_id] = true;
		}
		int res = 0;
		int lastMax = maxs[0];
		int i = 1;
		for (; i <= len; i++) {
			if (hasNum[i]) {
				res = Math.max(res, mins[i] - lastMax);
				lastMax = maxs[i];
			}
		}
		return res;
	}

	public static int bucket(long i, long len, long min, long max) {
		return (int)((i-min)*len/(max-min));
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
