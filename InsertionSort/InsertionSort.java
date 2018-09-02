package InsertionSort;

public class InsertionSort {
	static final int SIZE = 10;
	static void insertion(int[] a){
		int i,j,t,h;
		for ( i = 1; i < a.length; i++) {
			t = a[i];
			j= i-1;
			while (j>=0 && t<a[j]) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = t;
			System.out.println("第"+i+"步排序结果为:");
			for ( h = 0; h < a.length; h++) {
				System.out.print(" "+a[h]);
			}
			System.out.println("");
		}
		
	}
	public static void main(String[] args) {
		int[] shuzu = new int[SIZE];
		int i;
		for (i = 0; i < shuzu.length; i++) {
			shuzu[i] = (int) (100+Math.random()*(100+1));
		}
		System.out.println("排序前的数组为:");
		for (int j = 0; j < shuzu.length; j++) {
			System.out.print(shuzu[j]+" ");
		}
		System.out.println("");
		insertion(shuzu);
		System.out.println("排序后的数组为:");
		for (int j = 0; j < shuzu.length; j++) {
			System.out.print(shuzu[j]+" ");
		}
		System.out.println("");
	}
}
