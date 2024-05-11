package luogu;

import java.util.Scanner;

public class p1719 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int max=Integer.MIN_VALUE;
        int arr[][]=new int [n][n];
        int sum[][]=new int[n+1][n+1];
        for (int i = 0; i < n; i++) {
            for (int j=0;j<n;j++){
                arr[i][j]=scan.nextInt();
            }
        }
        for (int i=1;i<=n;i++){
            int temp=0;
            for (int j = 1; j <=n ; j++) {
                temp+=arr[i-1][j-1];
                sum[i][j]=sum[i-1][j]+temp;
            }
        }
        for (int x1=1;x1<=n;x1++){
            for (int y1 = 1; y1 <=n ; y1++) {
                for (int x2 = x1; x2 <=n ; x2++) {
                    for (int y2=y1;y2<=n;y2++){
                        int ans=sum[x2][y2]-sum[x1-1][y2]-sum[x2][y1-1]+sum[x1-1][y1-1];
                        max=Math.max(ans,max);
                    }

                }
            }
        }
        System.out.println(max);
    }
}
