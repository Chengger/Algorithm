package Sort;

public class HeapSort {
	public static void main(String[] args) {
		int[] arr = generateRandomArray(20, 50);
		printArray(arr);
		System.out.println("排序后：");
		heapSort2(arr);
		printArray(arr);
	}
	public static void heapSort2(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			heapInsert(arr,i);
		}												//形成大根堆
		int size = arr.length;
		swap(arr, 0, --size);
		while (size > 0) {
			heapify(arr,0,size);
			swap(arr, 0, --size);
		}
	}
	private static void heapify(int[] arr, int index, int size) {
		int left = index*2+1;
		while (left < size) {
			int largest = left+1 < size && arr[left + 1] > arr[left] ? left+1 : left;//选出左右的最大值
			largest = arr[largest] > arr[index] ? largest : index;
			if (largest == index) {
				break;
			}
			swap(arr, largest, index);
			index = largest;
			left = index * 2 + 1;
		}
	}
	private static void heapInsert(int[] arr, int index) {
		while (arr[index] > arr[(index-1)/2]) {
			 swap(arr, index, (index-1)/2);
			 index = (index - 1)/2;
		}
	}
	public static void swap(int[] nums,int i,int j) {
		int temp = nums[i];
		nums[i] = nums[j];
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
