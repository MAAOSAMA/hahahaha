package 蓝桥国赛;

import java.util.Arrays;

public class javac11D {
    public static void main(String[] args) {
        int arr[]=new int[25];
        long ans=1;
        arr[0]=2;
        arr[1]=3;
        arr[2]=5;
        arr[3]=7;
        int index=4;
        for (int i = 10; i <= 100; i++) {
            if (i%3!=0&&i%2!=0&&i%5!=0&&i%7!=0){
                arr[index++]=i;
            }
        }
        for (int i = 0; i < 25; i++) {
            int n=100,cnt=0;
            while (n>0){
                cnt+=n/=arr[i];

            }
            ans*=cnt+1;
        }
        System.out.println(ans);
    }
}
