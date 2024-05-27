package 蓝桥国赛;

import java.util.Scanner;
//%65;
public class javac13F {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int arr[]=new int[n];
        int cnt=0;
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
            if (arr[i]==1){
                cnt++;
            }
        }
        if (cnt!=0){
            System.out.println(n-cnt);
            return;
        }
        for (int i = 0; i < n-1; i++) {
            if (gcd(arr[i],arr[i+1])==1){
                System.out.println(n);
                return;
            }
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (gcd(arr[i],arr[j])==1){
                    System.out.println(j-i+n-1);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
    public static int  gcd(int x,int y){
        if (y==0){
            return x;
        }
        else return gcd(y,x%y);
    }
}
