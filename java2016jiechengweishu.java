package 蓝桥国赛;

import java.math.BigInteger;

public class java2016jiechengweishu {
    public static void main(String[] args) {
        BigInteger a=new BigInteger("1");
        for (int i = 1; i <= 9999; i++) {
            a=a.multiply(BigInteger.valueOf(i));
        }
        System.out.println(a.bitLength());
    }
}
