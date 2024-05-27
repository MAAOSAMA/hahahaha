package 蓝桥国赛;

import java.util.LinkedList;

public class javac11C {
    static  boolean arr[][]=new boolean [7000][7000];
    static  int move[][]={{1,0},{-1,0},{0,-1},{0,1}};
    static  long ans=4;
    public static void main(String[] args) {
        bfs();
        System.out.println(ans);
    }
    public static void bfs(){
        LinkedList<int[]>q=new LinkedList<>();
        q.offer(new int[]{2050,2050,0});
        q.offer(new int[]{2050+2020,2050+11,0});
        q.offer(new int[]{2050+11,2050+14,0});
        q.offer(new int[]{2050+2000,2050+2000,0});
        arr[2050][2050]=true;
        arr[2050+2020][2050+11]=true;
        arr[2050+11][2050+14]=true;
        arr[2050+2000][2050+2000]=true;
        while (!q.isEmpty()){
            int[]t=q.poll();
            int x=t[0];
            int y=t[1];
            int time=t[2];

            if (time==2020){
                break;
            }

            for (int i = 0; i < 4; i++) {
                int x1=x+move[i][0];
                int y1=y+move[i][1];
                if (!arr[x1][y1]){
                    q.offer(new int[]{x1,y1,time+1});
                    arr[x1][y1]=true;
                    ans++;
                }
            }
        }

    }
}
