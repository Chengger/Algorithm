package Sort;

public class BubbleSort {
	static final int SIZE = 10;
	public static void main(String[] args) {
		int[] shuzu = new int[SIZE];
		for (int j = 0; j < SIZE; j++) {
			shuzu[j] = (int) (100+Math.random()*(100+1));
		}
		System.out.println("����ǰ�����飺");
		for (int i = 0; i < SIZE; i++) {
			System.out.print(" "+shuzu[i]);
		}
		System.out.println();
		bubbleSort(shuzu);
		System.out.println("���������飺");
		for (int i = 0; i < SIZE; i++) {
			System.out.print(" "+shuzu[i]);
		}
	}
	
	public static void bubbleSort(int[] a) {
		int temp;
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < a.length-i; j++) {
				if (a[j] > a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.println("��"+i+"����������");
			for (int j = 0; j < a.length; j++) {
				System.out.print(" "+a[j]);
			}
			System.out.println();
		}
		
	}
}
