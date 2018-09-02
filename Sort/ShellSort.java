package Sort;
/**
 * shell����
 * @author Administrator
 *1.����n��Ԫ�ص�����ֳ�n/2���������У���һ�����ݺ͵�n/2+1������Ϊһ�ԣ�.....
 *2.һ��ѭ��ʹÿһ�����ж��ź�˳��
 *3.Ȼ���ٱ�Ϊn/4�����У��ٴ�����
 *4.�����ظ�
 */
public class ShellSort {
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
		shellSort(shuzu);
		System.out.println("���������飺");
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
			System.out.println("��"+x+"��������:");
			for (h = 0; h < a.length; h++) {
				System.out.print(" "+a[h]);
			}
			System.out.println();
		}
	}
}
