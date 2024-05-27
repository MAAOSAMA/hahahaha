package 蓝桥周赛.小白11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class eleven6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k= scan.nextInt();
        int arr[]=new int[n];
        int ans=Integer.MAX_VALUE;
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextInt();
            if (k-arr[i]==arr[i]){
                continue;
            }
            map.put(k-arr[i],i);
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])){
                int max=Math.max(map.get(arr[i]),i );
                int min=Math.min(map.get(arr[i]),i );
                int dl=max+1;
                int dr=n-min;
                int lr=Math.max(min+1,n-max);
                int t=Math.min(dl,Math.min(dr,lr));
                System.out.println(t);
                ans=Math.min(ans,t);
            }
        }
        System.out.println("-------");
        if (ans==Integer.MAX_VALUE){
            ans=-1;
        }
        System.out.println(ans);
    }
}
