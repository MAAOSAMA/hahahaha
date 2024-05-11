package luogu;

import java.util.Arrays;
import java.util.Scanner;

public class p4552 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int [n];
        arr[0]=scan.nextInt();
        long max=0;
        long min=0;
        for (int i=1;i<n;i++){
            arr[i]=scan.nextInt();
            if (arr[i]>arr[i-1]){
                max+=arr[i]-arr[i-1];
            }
            else{
                min+= Math.abs(arr[i]-arr[i-1]);
            }
        }
        System.out.println(Math.max(max,min));
        System.out.println(Math.abs(max-min)+1);
    }
}
