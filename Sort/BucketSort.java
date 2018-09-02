package Sort;
/**
 * Ͱ����֮��������
 * @author Administrator
 * ���������ݶ̵������
 */

public class BucketSort {
	public static void main(String[] args) {
		int[] test = generateRandomArray(20, 50);
		printArray(test);
		System.out.println("Ͱ�����");
		bucketSort2(test);
		printArray(test);
	}
	 public static void bucketSort2(int[] arr) {
		if (arr == null || arr.length < 2) {
			return;
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		int[] bucket = new int[max+1];
		for (int i = 0; i < arr.length; i++) {
			bucket[arr[i]]++; //bucket[]Ϊ0~max�ĳ��ȣ�����arr����arr[0]=1,�������bucket[1],
					           //��arr[1]=1,�ٽ������bucket[1],Ȼ��bucket[1]�е�ֵ��һ����bucket[1]=2,��Ϊ��1�����������2�Ρ�
		}
		int i = 0;
		for (int j = 0; j < bucket.length; j++) {
			while (bucket[j]-- > 0) {
				arr[i++] = j;//�жϵ�j��bucket�Ƿ���ֵ����ֵ�Ļ����������arr����
			}
		}
		
	}
	 public static int[] generateRandomArray(int maxSize, int maxValue) {
			int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) ((maxValue + 1) * Math.random());
			}
			return arr;
		}
	 public static void printArray(int[] arr) {
			if (arr == null) {
				return;
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
}
