package SelectSort;

public class SelectSort {
	static final int SIZE = 10;
	public static void selectSort(int[] a) {
		int index,temp;
		for (int i = 0; i < a.length-1; i++) {
			index = i;
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[index]) {
					index = j;
				}
			}
			if (index != i) {
				temp = a[i];
				a[i] = a[index];
				a[index] = temp;
			}
			System.out.println("第"+i+"步排序结果为:");
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		int[] shuzu = new int[SIZE];
		int i;
		for (i = 0; i < shuzu.length; i++) {
			shuzu[i] = (int) (100+Math.random()*(100+1));
		}
		System.out.println("排序前的数组为:");
		for (int j = 0; j < shuzu.length; j++) {
			System.out.print(shuzu[j]+" ");
		}
		System.out.println("");
		selectSort(shuzu);
		System.out.println("排序后的数组为:");
		for (int j = 0; j < shuzu.length; j++) {
			System.out.print(shuzu[j]+" ");
		}
		System.out.println("");
	}
}
