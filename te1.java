import java.util.Scanner;
public class te1 { 
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    long n=sc.nextLong();
    long k=sc.nextLong();
    if(k == 0){
        System.out.println(n*n);
        return ;
            }

    long count = 0;  //��¼�ҵ��������Ը���
    long temp;
            //˼·���̶�y����x
    for (long y = k + 1; y <= n; y++) {    //  x/y>=k,˵��y>k
        // ����n = a*y +b����ÿ������Ϊy��������ֻ�У�y-k������ģy����>=k��
        count += n/y*(y-k);    
        temp = n%y;
        if(temp >= k) {                    //�ٿ�������b�Ƿ�>=k
            count += temp-k+1;
        }
    }        
    System.out.println(count);  
}
}
