package 蓝桥国赛;

import java.util.Scanner;

public class javac14C {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ans=0;
        while(n>0){
            int t=n;
            int sum=0;
            while (t>0){
                sum+=t%10;
                t/=10;
            }
            n-=sum;
            ans++;
        }
        System.out.println(ans);
    }
}
