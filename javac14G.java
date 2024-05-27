package 蓝桥国赛;

import java.util.Arrays;
import java.util.Scanner;

public class javac14G {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=scan.nextInt();
        int b=scan.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scan.nextInt();
        }
        Arrays.sort(arr);

    }
}
