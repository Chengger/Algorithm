package Str;
/**
 * �ж�ĳһ�����Ƿ�Ϊ��������ƽ����
 * @author Administrator
 *
 */
public class judgeSquare {
	public static boolean judgeSquareNum(int num) {
		int i = 0, j = (int)Math.sqrt(num);
		while (i <= j) {
			int sqNum = i*i+j*j;
			if (sqNum == num) {
				return true;
			}else if (sqNum > num) {
				j--;
			}else {
				i++;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int num = 11;
		System.out.println(judgeSquareNum(num));
	}
}
