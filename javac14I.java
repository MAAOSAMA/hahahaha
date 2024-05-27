package 蓝桥国赛;

import java.util.Scanner;

public class javac14I {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int tree[]=new int[n+1];
        int q=scan.nextInt();
        for (int i = 0; i < q; i++) {
            int t=scan.nextInt();
            if (t==1){
                int x= scan.nextInt();
                int y= scan.nextInt();
                int z= scan.nextInt();
                tree[x]=z;
                int []v=new int[n+1];
                dfsup(tree,x,y,z,1,n,x);
                dfsdown(tree,x,y,z,1,n);
            }
            else {
                int x=scan.nextInt();
                System.out.println(tree[x]);
            }
        }
    }public static void dfsup(int[]tree,int x,int y,int z,int k,int n,int pre){
        if (k>y){
            return;
        }
        if (x/2>0){
            tree[x/2]=z;
            dfsup(tree,x/2,y,z,k+1,n,x);
        }
        if (pre!=x){
            if (pre%2==0&&pre+1<=n){
                tree[pre+1]=z;
                dfsdown(tree,pre+1,y,z,k+1,n);
            }else if (pre%2==1&&pre-1<=n){
                tree[pre-1]=z;
                dfsdown(tree,pre-1,y,z,k+1,n);
            }
        }
    }
    public static void dfsdown(int[]tree,int x,int y,int z,int k,int n){
        if (k>y){
            return;
        }
        if (x*2<=n){
            tree[x*2]=z;
            dfsdown(tree,x*2,y,z,k+1,n);
        }
        if (x*2+1<=n){
            tree[x*2+1]=z;
            dfsdown(tree,x*2+1,y,z,k+1,n);
        }
    }
}