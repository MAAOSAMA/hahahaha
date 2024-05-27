package 蓝桥国赛;

import java.math.BigInteger;

public class javac13A {
    public static void main(String[] args) {
        BigInteger a=new BigInteger("1");
        BigInteger b=new BigInteger("1");
        BigInteger six=new BigInteger("7");

        BigInteger mod=new BigInteger("10");
        int cnt=2;
        int ans=0;
        System.out.print(a+"  "+b+"  ");
        for (int i = 3; i <=60 ; i++) {
            BigInteger c=a.add(b);
            a=b;
            b=c;
            cnt++;
            System.out.print(c.mod(mod)+"  ");
            if (c.mod(mod).equals(six)){
                ans++;
            }
            if (cnt==10){
                cnt=0;
                System.out.println();
            }
        }
        long x=202202011200l;
        long bb=x/60;
        long res=bb*8;
        System.out.println(res);
    }
}
