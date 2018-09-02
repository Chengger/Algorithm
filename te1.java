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

    long count = 0;  //记录找到的整数对个数
    long temp;
            //思路：固定y，找x
    for (long y = k + 1; y <= n; y++) {    //  x/y>=k,说明y>k
        // 假设n = a*y +b；在每个长度为y的区间里只有（y-k）个数模y余数>=k。
        count += n/y*(y-k);    
        temp = n%y;
        if(temp >= k) {                    //再考虑余数b是否>=k
            count += temp-k+1;
        }
    }        
    System.out.println(count);  
}
}
