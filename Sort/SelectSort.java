package Sort;
/**
 * ѡ������
 * @author Administrator
 *1.���ȴ�ԭʼ������ѡ����С��һ����������͵�һ��λ�õ����ݽ���
 *2.���Ŵ�ʣ�µ�n-1��������ѡ����С��һ������������ڶ���λ�õ����ݽ���
 *3.���ϵ��ظ�
 */
public class SelectSort {
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
		selectSort(shuzu);
		System.out.println("���������飺");
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
			System.out.println("��"+i+"����������");
			for (int j = 0; j < a.length; j++) {
				System.out.print(" "+a[j]);
			}
			System.out.println();
		}
	}
}
