package BubbleSort;

public class BubbleSort {
	static final int SIZE = 10;
	public static void bubbleSort(int[] a) {
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.print("��"+i+"��������:");
			for (int k = 0; k < a.length; k++) {
				System.out.print(" "+a[k]);
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		int[] shuzu = new int[SIZE];
		int i;
		for (int j = 0; j < SIZE; j++) {
			shuzu[j] = (int) (100+Math.random()*(100+1));
		}
		System.out.println("����ǰ������Ϊ:");
		for (int j = 0; j < SIZE; j++) {
			System.out.print(shuzu[j]+" ");
		}
		System.out.println("");
		bubbleSort(shuzu);
		System.out.println("����������Ϊ:");
		for (int j = 0; j < SIZE; j++) {
			System.out.print(shuzu[j]+" ");
		}
		System.out.println("");
	}

}
