package 蓝桥国赛;

import java.util.LinkedList;
import java.util.Scanner;

public class javac14H {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[][]=new int[n][n];
        int v[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        int ans=bfs(arr,0,0,n,0,v);
        System.out.println(ans);

    }
    public  static int bfs(int arr[][],int x,int y,int n,int time,int v[][]){
        LinkedList<int[]> q=new LinkedList<>();
        int ans=1;
        q.offer(new int[]{x,y,time});
        while (!q.isEmpty()){
            int []t=q.poll();
            int xx=t[0];
            int yy=t[1];
            int tt=t[2];
            if (xx==n-1&&yy==n-1){
                ans=tt;
                return ans;
            }
            if (yy+1<n){
                while(yy+1<n&&arr[xx][yy]>arr[xx][yy+1]){
                    v[xx][yy]=1;
                    yy++;
                }
                if (v[xx][yy]==0&&yy>t[1]){
                    q.offer(new int[]{xx,yy,tt+1});
                    v[xx][yy]=1;
                }
            }
            if (t[1]+1<n&&v[xx][t[1]+1]==0){
                q.offer(new int[]{xx,t[1]+1,tt+1});
                v[xx][t[1]+1]=1;
            }
            if (xx+1<n&&v[xx+1][t[1]]==0){
                q.offer(new int[]{xx+1,t[1],tt+1});
                v[xx+1][t[1]]=1;
            }
        }
        return ans;
    }
}
