package Sort;
/**
 * 快速排序（是对冒泡排序的改进）
 * @author Administrator
 *1.首先设定一个分界值，通过该分解值将该数组分为左右两部分
 *2.首先将大于分解值的数据集中到数组右边，小于分解值的数据集中到数组左边
 *3.然后，左边和右边的数据可以独立排序，对于左侧的值，可以取一个分解值，将该数据分为左右两部分；右边同理
 *4.重复这个过程
 */
public class QuickSort {
	static final int SIZE = 18;
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
		quickSort(shuzu,0,SIZE-1);
		System.out.println("排序后的数组：");
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
