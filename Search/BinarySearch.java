package Search;
/**
 * ���ֲ���
 * �Ƕ����ź����������в��ҵ�
 */
import java.util.Scanner;


public class BinarySearch {
	static final int N = 15;
	public static void main(String[] args) {
		int x,n,i;
		int[] shuzu = new int[15];
		
		for (i = 0; i < shuzu.length; i++) {
			shuzu[i] = (int) (100+Math.random()*(100+1));
		}
		System.out.println("�۰�����㷨��ʾ��");
		System.out.println("����ǰ�������У�");
		for (i = 0; i < shuzu.length; i++) {
			System.out.print(" "+shuzu[i]);
		}
		System.out.println();
		quickSort(shuzu,0,N-1);
		System.out.println("������������У�");
		for (i = 0; i < shuzu.length; i++) {
			System.out.print(" "+shuzu[i]);
		}
		System.out.println();
		System.out.println("����Ҫ���ҵ�����");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		
		n = binarySearch(shuzu,N,x);
		
		if (n < 0 ) {
			System.out.println("û�ҵ����ݣ�"+x);
		}
		else {
			System.out.println("���ݣ�"+x+"λ�������"+(n+1)+"��Ԫ�ش�!");
		}
	}
	private static void quickSort(int[] a, int left, int right) {
		int f,t;
		int rtemp,ltemp;
		
		ltemp = left;
		rtemp = right;
		f = a[(left+right)/2];
		
		while (ltemp<rtemp) {
			while (a[ltemp]<f) {
				++ltemp;
			}
			while (a[rtemp]>f) {
				--rtemp;
			}
			if (ltemp<=rtemp) {
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
		if (left<rtemp) {
			quickSort(a, left, ltemp-1);
		}
		if (right>ltemp) {
			quickSort(a, rtemp+1, right);
		}
	}
	private static int binarySearch(int[] a, int n, int x) {
		int mid,low,high;
		
		low = 0;
		high = n-1;
		while (low <= high) {
			mid = (low+high)/2;
			if (a[mid] == x) {
				return mid;
			}else if (a[mid] > x) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return -1;
	}
	
	
}
