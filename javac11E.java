package 蓝桥国赛;

import java.util.Arrays;
import java.util.Scanner;

public class javac11E {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        long sum=0;
        long sum1=0;
        for (int i = 0; i < 4; i++) {
            String s=scan.next();
            sb.append(s);
        }
        char[] ch=sb.toString().toCharArray();
       long dp[]=new long[200];
        for (int i = 0; i < 200; i++) {
            dp[i]++;
            for (int j = i-1; j >=0 ; j--) {
                if (ch[j]==ch[i]){
                    dp[i]--;
                    break;
                }
                if (ch[j]<ch[i]){
                    dp[i]+=dp[j];
                }
            }
            sum+=dp[i];
        }

        System.out.println(sum);

    }
}
