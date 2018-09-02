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
		System.out.println("顺序查找算法演示！");
		System.out.println("数据序列：");
		for (i = 0; i < shuzu.length; i++) {
			System.out.print(" "+shuzu[i]);
		}
		System.out.println();
		System.out.println("输入要查找的数：");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		
		n = shunxuSearch(shuzu,N,x);
		
		if (n < 0 ) {
			System.out.println("没找到数据："+x);
		}
		else {
			System.out.println("数据："+x+"位于数组第"+(n+1)+"个元素处!");
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
