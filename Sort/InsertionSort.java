package Sort;
/**
 * 插入排序
 * @author Administrator
 *1.首先对前两个数据进行从小到大的排序
 *2.接着将第3个数据与排好序的两个数据比较，将第3个数据插入到合适的位置
 *3.然后，将第4个数据插入到已排好序的前3个数据中
 *4.不断重复
 */
public class InsertionSort {
	static final int SIZE = 10;
	public static void main(String[] args) {
		int[] shuzu = new int[SIZE];
		for (int j = 0; j < SIZE; j++) {
			shuzu[j] = (int) (100+Math.random()*(100+1));
		}
		System.out.println("排序前的数组：");
		for (int i = 0; i < SIZE; i++) {
			System.out.print(" "+shuzu[i]);
		}
		System.out.println();
		insertionSort(shuzu);
		System.out.println("排序后的数组：");
		for (int i = 0; i < SIZE; i++) {
			System.out.print(" "+shuzu[i]);
		}
	}
	private static void insertionSort(int[] a) {
		int i,j,t,h;
		for (i = 1; i < a.length; i++) {
			t = a[i];
			j = i-1;
			while (j >= 0 && t < a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
		
			System.out.println("第"+i+"趟排序结果：");
			for (h = 0; h < a.length; h++) {
				System.out.print(" "+a[h]);
			}
			System.out.println();
		}
	}
}
/* for(int i = 1;i < arr.length;i++){
 * 	for(int j = i-1;j >= && arr[j] > arr[j+1];j--){
 * 		swap(arr,j,j+1);
 * }
 * }
 * */
