package 蓝桥国赛;

import java.util.Scanner;

public class javac14F {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
        }

        if (arr[0]==1){
            arr[1]+=1;
            arr[0]=0;
        }
        if (arr[n-1]==1){
            for (int i = n-2; i >=0 ; i--) {
                if (arr[i]!=0){
                    arr[i]+=1;
                    arr[n-1]=0;
                    break;
                }
            }
        }
        for (int i = 1; i <n-1 ; i++) {
             if (arr[i]==1) {
                if (arr[i-1]==2){
                    arr[i-1]+=1;
                } else if (arr[i-1]==0&&i>2) {
                    if (arr[i-2]>arr[i+1]){
                        arr[i+1]+=1;
                    }
                    else arr[i-2]+=1;

                }
                else{
                    if (arr[i-1]<arr[i+1]){
                        arr[i-1]++;
                    }
                    else {
                        arr[i+1]++;
                    }
                }
                arr[i]=0;
            }

        }
        long ans=1;
        int mod=1000000007;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                ans*=arr[i];
                ans%=mod;
            }
        }
        System.out.println(ans);
    }
}
