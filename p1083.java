package luogu;

import java.util.Arrays;
import java.util.Scanner;

public class p1083 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int arr[]=new int[n+1];
        int cf[]=new int[n+2];
        int mm[][]=new int[m+1][3];
        for (int i=1;i<=n;i++){
            arr[i]=scan.nextInt();
        }
        for (int i=1;i<=m;i++){
            mm[i][0]=scan.nextInt();
            mm[i][1]=scan.nextInt();
            mm[i][2]=scan.nextInt();
            cf[mm[i][1]]+=mm[i][0];
            cf[mm[i][2]+1]-=mm[i][0];
        }
        long temp=0;
        boolean flag=false;
        for (int i=1;i<=n;i++){
            temp+=cf[i];
            if (temp>arr[i]){
                System.out.println(-1);
                flag=true;
                break;
            }
        }
        if (flag){
            int l=1,r=m;;
            while(l<=r){
                Arrays.fill(cf,0);
                int mid=(l+r)/2;
                for (int i=1;i<=mid;i++){
                    cf[mm[i][1]]+=mm[i][0];
                    cf[mm[i][2]+1]-=mm[i][0];
                }

                if (check(l,m,mm,cf,arr)){

                    l=mid+1;
                }
                else {
                    r=mid-1;
                }
            }
            System.out.println(l);
        }
        else {
            System.out.println(0);
        }

    }
    public static boolean check(int l,int mid,int[][]mm,int []cf,int[]arr){
        long temp=0;
        for (int i=1;i<=mid;i++){
            temp+=cf[i];
            if (temp>arr[i]){
               return false;
            }
        }
        return true;
    }
}
