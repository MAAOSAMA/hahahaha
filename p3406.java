package luogu;
import java.util.*;
public class p3406 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=0;
        int y=0;
        int n=scan.nextInt();
        int m=scan.nextInt();
        long city[]=new long[n+1];
        int price[][]=new int[n+1][3];
        int cf[]=new int [n+2];
        int go[]=new int[m];
        go[0]=scan.nextInt();
        for (int i=1;i<m;i++){
            go[i]= scan.nextInt();
            if (go[i]>go[i-1]){
                x=go[i-1];
                y=go[i];
            }
            else {
                x=go[i];
                y=go[i-1];
            }
            cf[x+1]++;
            cf[y+1]--;
        }
        int temp=0;
        for (int i=1;i<=n;i++){
            temp+=cf[i];
            city[i]+=temp;
        }
        long ans=0;
        for (int i=2;i<=n;i++){
            price[i][0]=scan.nextInt();
            price[i][1]=scan.nextInt();
            price[i][2]=scan.nextInt();
            ans+=Math.min(price[i][0]*city[i],price[i][1]*city[i]+price[i][2]);
        }
        System.out.println(ans);
    }
}
