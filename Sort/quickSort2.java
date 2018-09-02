package Sort;

public class quickSort2 {
	public static void main(String[] args) {
		int[] arr = generateRandomArray2(20, 30);
		printArray(arr);
		
		System.out.println("\n≈≈–Ú∫Û£∫");
		quickSort2good(arr);
		printArray(arr);
	}
	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}
	public static int[] generateRandomArray2(int maxsize,int maxvalue) {
		int[] arr = new int[(int) ((maxsize + 1) * Math.random())];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (10*maxvalue+Math.random()*(100+1));
		}
		return arr;
	}
	public static void quickSort2good(int[] num) {
		if (num == null || num.length < 2) {
			return;
		}
		quickSort2good(num, 0, num.length-1);
	}
	public static void quickSort2good(int[] nums,int i,int j) {
		if (i < j) {
			swap(nums,i+(int)(Math.random()*(j-i+1)),j);
			int[] p = partition(nums, i, j);
			quickSort2good(nums, i, p[0]-1);
			quickSort2good(nums, p[1]+1, j);
		}
	}
	public static int[] partition(int[] arr,int i,int j) {
		int left = i-1;
		int right = j;
		while (i < right) {
			if (arr[i] < arr[j]) {
				swap(arr, ++left, i++);
			}else if (arr[i] > arr[j]) {
				swap(arr, --right, i);
			}else {
				i++;
			}
		}
		swap(arr, right, j);
		return new int[] {left+1,right};
		
	}
	
	public static void swap(int[] nums,int i,int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
