package 蓝桥国赛;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class javac13B {

    static boolean flag[]=new boolean[100000010];
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    sushu();
    int ans=0;
        for (int i = 0; i < 2000000; i++) {
            long x=scan.nextLong();
            if (x<100000008){
                if (!flag[(int)x]){
                    ans++;
                }
            }
            else {
                if (check(x)){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    public static boolean check(long x){
        for (int i = 2; i <=x/i ; i++) {
            if (x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void sushu(){
        for (int i = 2; i <= 1000000000; i++) {
            if (!flag[i]){
                for (int j = 2*i; j <=1000000000; j+=i) {
                    flag[j]=true;
                }
        }

        }
    }
}
