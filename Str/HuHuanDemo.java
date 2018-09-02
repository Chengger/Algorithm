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
		System.out.println("你输入的数组是:");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]+" ");
		}
		for (int i = 0; i < 5; i++) {
			s = ary[i];
			ary[i] = ary[9-i];
			ary[9-i] = s;
		}
		System.out.println();
		System.out.println("对换后的数组为:");
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
				System.out.println("请输入第"+(i+1)+"个整数");
				try {
					array[i] = Integer.parseInt(buf[i].readLine());
				} catch (NumberFormatException e) {
					System.out.println("数据输入错误，请重新输入:");
					n = 0;
				}catch(IOException e) {
					e.printStackTrace();
				}
			} while (n == 0);
		}
		return array;
	}
}
