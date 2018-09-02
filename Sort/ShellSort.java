package Sort;
/**
 * shell排序
 * @author Administrator
 *1.将有n个元素的数组分成n/2个数字序列，第一个数据和第n/2+1个数据为一对，.....
 *2.一次循环使每一个序列对排好顺序
 *3.然后，再变为n/4个序列，再次排序
 *4.不断重复
 */
public class ShellSort {
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
		shellSort(shuzu);
		System.out.println("排序后的数组：");
		for (int i = 0; i < SIZE; i++) {
			System.out.print(" "+shuzu[i]);
		}
	}
	private static void shellSort(int[] a) {
		int i,j,h;
		int r,temp;
		int x = 0;
		for(r = a.length/2; r >= 1;r/=2) {
			for (i = r; i < a.length; i++) {
				temp = a[i];
				j = i-r;
				while (j >= 0 && temp < a[j]) {
					a[j+r] = a[j];
					j -= r;
				}
				a[j+r] = temp;
			}
			x++;
			System.out.println("第"+x+"趟排序结果:");
			for (h = 0; h < a.length; h++) {
				System.out.print(" "+a[h]);
			}
			System.out.println();
		}
	}
}
