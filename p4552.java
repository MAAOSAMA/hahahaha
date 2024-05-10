package luogu;

import java.util.Arrays;
import java.util.Scanner;

public class p4552 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        long cf[]=new long [n];
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }
        long a=0,b=0;
        for (int i=1;i<n;i++){
            long x=arr[i]-arr[i-1];
            if (x>=0){
                a+=x;
            }else{
                b+=Math.abs(x);
            }
            cf[i]=x;
        }
        System.out.println(Math.max(a,b));
        System.out.println((Math.abs(a-b)+1));
    }
}
