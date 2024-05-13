package 蓝桥国赛;

import java.util.Scanner;

public class javac11J {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int in[]=new int[n];
        int out[]=new int[n];
        long ans=0;
        int ini=0;
        int outi=0;
        long temp=0;
        for (int i=0;i<n;i++){
            int x=scan.nextInt();
            int y=scan.nextInt();
            int z=scan.nextInt();
            in[i]=x+y;
            out[i]=z;
        }
        for (int i=0;i<n;i++){
            int aa=in[i];
            int index=i;
            for (int j=i+1;j<n;j++){
                if (in[j]<aa){
                    aa=in[j];
                    index=j;
                }
            }
            in[index]=in[i];
            in[i]=aa;
            int t=out[i];
            out[i]=out[index];
            out[index]=t;
        }
        for (int i = 0; i <n ; i++) {
            if (i==n-1){
                if (ini==0){
                    temp+=in[i];
                    ans+=temp;
                }
                else {
                    if (ini+outi<=in[i]+out[i]){
                        temp+=ini;
                        ans+=temp;
                        temp+=outi;
                        ini=0;outi=0;
                        i--;
                    }
                    else {
                        temp+=in[i];
                        ans+=temp;
                        temp+=out[i];
                        temp+=ini;
                        ans+=temp;
                        break;
                    }
                }

            }
            else {
                if (ini!=0){
                    if (ini+outi<=in[i]+out[i]){
                        temp+=ini;
                        ans+=temp;
                        temp+=outi;
                        ini=0;outi=0;
                        i--;
                    }
                    else{
                        temp+=in[i];
                        ans+=temp;
                        temp+=out[i];
                    }
                }
                else {
                    if (in[i]+out[i]<=in[i+1]+out[i+1]){
                        temp+=in[i];
                        ans+=temp;
                        temp+=out[i];
                    }
                    else{
                        temp+=in[i+1];
                        ans+=temp;
                        temp+=out[i+1];
                        ini=in[i];
                        outi=out[i];
                        i++;
                    }
                }

            }


        }
        System.out.println(ans);
    }
}
