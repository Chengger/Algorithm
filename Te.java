import java.util.Arrays;
import java.util.Scanner;
/**
 * ���ױ�����2
 * @author Cheng_er
 *
 */
public class Te {
	 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        int jobNum = in.nextInt();
        int friendNum = in.nextInt();
        int[][] jdArray = new int[jobNum][2];
        for (int x = 0; x < jobNum; x++) {
            jdArray[x][0] = in.nextInt();
            jdArray[x][1] = in.nextInt();
        }
        int[] ability = new int[friendNum];
        for (int x = 0; x < friendNum; x++) {
            ability[x] = in.nextInt();
        }
        process2(jdArray, ability);
 
    }
 
    public static void process2(int[][] jdArray, int[] ability) {
        // ���չ����Ѷ���������
        Arrays.sort(jdArray, (int[] jd1, int[] jd2) -> {return jd1[0] - jd2[0];});
 
        // ����ÿ�������ı���Ϊ��ǰ�Ѷ����ܻ�ȡ����󱨳�
        for (int i = 0; i < jdArray.length - 1; i++) {
            if (jdArray[i][1] > jdArray[i + 1][1]) {
                jdArray[i + 1][1] = jdArray[i][1];
            }
        }
 
        // ���ֲ���ȷ����ʤ�ε�������Ѷȼ�����󱨳�
        for (int i = 0; i < ability.length; i++) {
            int index = Arrays.binarySearch(jdArray, new int[] {ability[i], 0}, (int[] jd1, int[] jd2) ->{
                return jd1[0] - jd2[0];});
            index = index < 0 ? -(index + 1) - 1: index;
            System.out.println(index >= 0 ? jdArray[index][1] : 0);
        }
 
    }
}