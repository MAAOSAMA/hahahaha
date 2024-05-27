package 蓝桥国赛;

import java.util.Arrays;
import java.util.Scanner;
//没写完
public class javac14D {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s[]=scan.nextLine().split(" ");
        int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int ans=0;
        int mon[]=new int[13];
        int day=0;
        int hour=0;
        int min=0;
        int sec=0;
        String t=s[4];
        if (t=="*"){
            Arrays.fill(mon,1);
        }
        else if (t.contains("-")) {
            int star=0;
            int end=0;
            if (t.length()==3){
                star=Integer.valueOf(t.charAt(0));
                end=Integer.valueOf(t.charAt(2));
            }
            else if(t.length()==4) {
                star=Integer.valueOf(t.charAt(0));
                end=10+Integer.valueOf(t.charAt(3));
            }
            else {
                star=10+Integer.valueOf(t.charAt(1));
                end=10+Integer.valueOf(t.charAt(4));
            }
            for (int i = star; i <=end ; i++) {
                mon[i]=1;
            }
        }
        else if (t.contains(",")) {
            String te[]=s[4].split(",");
            for (int i = 0; i < te.length; i++) {
                mon[Integer.valueOf(te[i])]=1;
            }
        }
        else {
            mon[Integer.valueOf(t)]=1;
        }
    }
}
