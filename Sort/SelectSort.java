package Sort;
/**
 * 选择排序
 * @author Administrator
 *1.首先从原始数组中选择最小的一个数，将其和第一个位置的数据交换
 *2.接着从剩下的n-1个数据中选择最小的一个数，将其与第二个位置的数据交换
 *3.不断的重复
 */
public class SelectSort {
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
		selectSort(shuzu);
		System.out.println("排序后的数组：");
		for (int i = 0; i < SIZE; i++) {
			System.out.print(" "+shuzu[i]);
		}
	}
	private static void selectSort(int[] a) {
		int index;
		int temp;
		for (int i = 0; i < a.length-1; i++) {
			index = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j]<a[index]) {
					index = j;
				}
			}
			if (index != i) {
				temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
			System.out.println("第"+i+"趟排序结果：");
			for (int j = 0; j < a.length; j++) {
				System.out.print(" "+a[j]);
			}
			System.out.println();
		}
	}
}
