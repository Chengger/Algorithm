package Str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HuHuanDemo {
	public static void main(String[] args) {
		huhuanPrint();
	}

	public static void huhuanPrint() {
		int[] ary = write();
		int s;
		System.out.println("�������������:");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
		for (int i = 0; i < 5; i++) {
			s = ary[i];
			ary[i] = ary[9-i];
			ary[9-i] = s;
		}
		System.out.println();
		System.out.println("�Ի��������Ϊ:");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
		System.out.println();
	}

	public static int[] write() {
		BufferedReader[] buf = new BufferedReader[10];
		int n;
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			buf[i] = new BufferedReader(new InputStreamReader(System.in));
			do {
				n = 1;
				System.out.println("�������"+(i+1)+"������");
				try {
					array[i] = Integer.parseInt(buf[i].readLine());
				} catch (NumberFormatException e) {
					System.out.println("���������������������:");
					n = 0;
				}catch(IOException e) {
					e.printStackTrace();
				}
			} while (n == 0);
		}
		return array;
	}
}
