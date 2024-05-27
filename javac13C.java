package 蓝桥国赛;

import java.util.*;

public class javac13C {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int te=scan.nextInt();
        for (int j = 0; j < te; j++) {
            int n=scan.nextInt();
            int m=scan.nextInt();
            boolean flag=true;
            Map<Integer,Integer> map=new HashMap<>();
            for (int i = 1; i <=m ; i++) {
                int t=n%i;
                if (map.containsKey(t)){
                    System.out.println("Yes");
                    flag=false;
                    break;
                }
                map.put(t,i);
            }
            if (flag){
                System.out.println("No");
            }

        }

    }
}
