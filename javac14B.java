package 蓝桥国赛;

import java.util.HashSet;
import java.util.Set;

public class javac14B {
    public static void main(String[] args) {
        long n=1000000;
        int ans=0;
        Set<Long> set=new HashSet<>();
        for (long i=1;i<n;i++){
            long t=i*i;
            if (t>n){
                break;
            }
            if (check(t,i,i)){
                set.add(t);
            }
            for (long j = i+1; j < n; j++) {
                long te=i*j;
                if (te>n){
                    break;
                }
                if (check(te,i,j)){
                    set.add(te);
                }
            }

        }
        System.out.println(set.size());
    }
    public static boolean check(long t,long a,long b){
        int num[]=new int[10];
        while(t>0){
            int e=(int)(t%10);
            num[e]++;
            t/=10;
        } while(a>0){
            int e=(int)(a%10);
            num[e]--;
            a/=10;
        } while(b>0){
            int e=(int)(b%10);
            num[e]--;
            b/=10;
        }
        for (int i = 0; i <num.length ; i++) {
            if (num[i]!=0){
                return false;
            }
        }
        return true;
    }
}
