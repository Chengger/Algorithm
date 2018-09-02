package Sort;
/**
 * ���������Ƕ�ð������ĸĽ���
 * @author Administrator
 *1.�����趨һ���ֽ�ֵ��ͨ���÷ֽ�ֵ���������Ϊ����������
 *2.���Ƚ����ڷֽ�ֵ�����ݼ��е������ұߣ�С�ڷֽ�ֵ�����ݼ��е��������
 *3.Ȼ����ߺ��ұߵ����ݿ��Զ������򣬶�������ֵ������ȡһ���ֽ�ֵ���������ݷ�Ϊ���������֣��ұ�ͬ��
 *4.�ظ��������
 */
public class QuickSort {
	static final int SIZE = 18;
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
		quickSort(shuzu,0,SIZE-1);
		System.out.println("���������飺");
		for (int i = 0; i < SIZE; i++) {
			System.out.print(" "+shuzu[i]);
		}
	}
	private static void quickSort(int[] a,int left,int right) {
		int f,t;
		int ltemp,rtemp;
		ltemp = left;
		rtemp = right;
		f = a[(left+right)/2];
		while(ltemp < rtemp) {
			while (a[ltemp] < f) {
				++ltemp;
			}
			while (a[rtemp] > f) {
				--rtemp;
			}
			if (ltemp < rtemp) {
				t = a[ltemp];
				a[ltemp] = a[rtemp];
				a[rtemp] = t;
				--rtemp;
				++ltemp;
			}
		}
		if (ltemp == rtemp) {
			ltemp++;
		}
		if (left < rtemp) {
			quickSort(a, left, ltemp-1);
		}
		if (right > ltemp) {
			quickSort(a, rtemp+1, right);
		}
	}
}
