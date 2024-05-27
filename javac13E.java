package 蓝桥国赛;

import java.util.Scanner;

public class javac13E {
    static Scanner scan=new Scanner(System.in);
    static int n=scan.nextInt();
    final static int N=1000005;

    static int []t=new int[n];

    static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {

        int arr[]=new int [n];

        for (int i = 0; i < n; i++) {
            arr[i]= scan.nextInt();;
        }
        for (int i = 1; i <=N; i++) {
            int ans=0;
            feb(i,n);
            for (int j = 0; j < n; j++) {
                if (t[j]>N){
                    ans+=n-j;
                    break;
                }
                if (arr[j]!=t[j]){
                    ans++;
                }
            }
            min=Math.min(ans,min);
        }
        System.out.println(min);
    }
    public static void feb(int star,int n){

        t[0]=t[1]=star;
        for (int i = 2; i < n; i++) {
            t[i]=t[i-1]+t[i-2];
            if (t[i]>N){
                return;
            }
        }

    }
}
