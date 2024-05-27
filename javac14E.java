package 蓝桥国赛;

import java.math.BigInteger;
import java.util.Scanner;
//没写完
public class javac14E {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int t=n-4*m;System.out.println(t);
        if (t==0){
            System.out.println(1);
        }

        else{
            int x=t+m;
            int i=t;
            BigInteger a=new BigInteger(Integer.toString(x));
            BigInteger mul=new BigInteger("10");
            BigInteger mod=new BigInteger("998244353");
            while (i>0){
                a=a.multiply(new BigInteger(Integer.toString(x-1)));
                x--;
                i--;
            }
            i=t;
            while (i>0){
                a=a.divide(new BigInteger(Integer.toString(i)));
                i--;
            }
            while(t>0){
                System.out.println("hhh");
                a=a.multiply(mul);
                t--;
            }
            a=a.mod(mod);
            System.out.println(a);
        }

    }
}
