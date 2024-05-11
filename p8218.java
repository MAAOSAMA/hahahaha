package luogu;

import java.util.Scanner;

public class p8218 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        arr[0]=scan.nextInt();
        int sum[]=new int[n+1];
        for (int i = 1; i < n; i++) {
            arr[i]=scan.nextInt();
            sum[i]=sum[i-1]+arr[i-1];
        }
        sum[n]=sum[n-1]+arr[n-1];
        int m=scan.nextInt();
        int l=0,r=0;
        for (int i=0;i<m;i++){
            l=scan.nextInt();
            r=scan.nextInt();
            System.out.println(sum[r]-sum[l-1]);
        }
    }
}
