package Search;

import java.util.Scanner;

public class ShunxuSearch {
	static final int N = 15;
	public static void main(String[] args) {
		int x,n,i;
		int[] shuzu = new int[15];
		
		for (i = 0; i < shuzu.length; i++) {
			shuzu[i] = (int) (100+Math.random()*(100+1));
		}
		System.out.println("˳������㷨��ʾ��");
		System.out.println("�������У�");
		for (i = 0; i < shuzu.length; i++) {
			System.out.print(" "+shuzu[i]);
		}
		System.out.println();
		System.out.println("����Ҫ���ҵ�����");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		
		n = shunxuSearch(shuzu,N,x);
		
		if (n < 0 ) {
			System.out.println("û�ҵ����ݣ�"+x);
		}
		else {
			System.out.println("���ݣ�"+x+"λ�������"+(n+1)+"��Ԫ�ش�!");
		}
	}
	private static int shunxuSearch(int[] a, int n, int x) {
		int i,f =-1;
		for (i = 0; i < n; i++) {
			if (x == a[i]) {
				f = i;
				break;
			}
		}
		return f;
	}
}
