package Sort;
/**
 * ��������
 * @author Administrator
 *1.���ȶ�ǰ�������ݽ��д�С���������
 *2.���Ž���3���������ź�����������ݱȽϣ�����3�����ݲ��뵽���ʵ�λ��
 *3.Ȼ�󣬽���4�����ݲ��뵽���ź����ǰ3��������
 *4.�����ظ�
 */
public class InsertionSort {
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
		insertionSort(shuzu);
		System.out.println("���������飺");
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
		
			System.out.println("��"+i+"����������");
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
