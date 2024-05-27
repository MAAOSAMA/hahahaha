package 蓝桥国赛;

import java.util.ArrayList;
import java.util.Scanner;
//我太菜了，不会！
public class javac13H {
    static Scanner scan=new Scanner(System.in);
    static int n=scan.nextInt();
    static int[][]move={{1,0},{-1,0},{0,1},{0,-1}};

    static ArrayList<int[]> list=new ArrayList<>();

    public static void main(String[] args) {
        char ch[][]=new char[n][n];
        int flag[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            String s=scan.next();
            ch[i]=s.toCharArray();
            for (int j = 0; j < n; j++) {
                if (ch[i][j]!='.'){
                    list.add(new int[]{i,j});
                    flag[i][j]=-1;
                }
            }
        }
        dfs(ch,flag,0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch[i][j]);
            }
            System.out.println();
        }
    }
    public static void dfs(char[][]ch,int flag[][],int index){
        if (light(flag)||index==list.size()-1){
            return;
        }
        int x=list.get(index)[0];
        int y=list.get(index)[1];
        char t=ch[x][y];
        if (t-'0'==1){
            for (int i = 0; i < 4; i++) {
                int xx=x+move[i][0];
                int yy=y+move[i][1];
                if (xx>=0&&xx<n&&yy>=0&&yy<n&&flag[xx][yy]==0){
                    ch[xx][yy]='O';
                    put(xx,yy,flag);
                    dfs(ch,flag,index+1);
                    ch[xx][yy]='.';
                    pull(xx,yy,flag);
                }
            }
        }
        if (t-'0'==2){
            for (int i = 0; i < 4; i++) {
                int xx=x+move[i][0];
                int yy=y+move[i][1];
                if (xx>=0&&xx<n&&yy>=0&&yy<n&&flag[xx][yy]==0){
                    ch[xx][yy]='O';
                    put(xx,yy,flag);
                    for (int j = i+1; j < 4; j++) {
                        int xxx=x+move[j][0];
                        int yyy=y+move[j][1];
                        if (xxx>=0&&xxx<n&&yyy>=0&&yyy<n&&flag[xxx][yyy]==0){
                            ch[xxx][yyy]='O';
                            put(xxx,yyy,flag);
                            dfs(ch,flag,index+1);
                            ch[xxx][yyy]='.';
                            pull(xxx,yyy,flag);
                        }
                    }
                    dfs(ch,flag,index+1);
                    ch[xx][yy]='.';
                    pull(xx,yy,flag);
                }
            }
        }
        if (t-'0'==3){
            for (int i = 0; i < 4; i++) {
                int xx=x+move[i][0];
                int yy=y+move[i][1];
                if (xx>=0&&xx<n&&yy>=0&&yy<n&&flag[xx][yy]==0){
                    ch[xx][yy]='O';
                    put(xx,yy,flag);
                }
            }
            for (int i = 0; i < 4; i++) {
                int xx=x+move[i][0];
                int yy=y+move[i][1];
                if (xx>=0&&xx<n&&yy>=0&&yy<n&&flag[xx][yy]==0){
                    ch[xx][yy]='.';
                    pull(xx,yy,flag);
                    dfs(ch,flag,index+1);
                    ch[xx][yy]='O';
                    put(xx,yy,flag);
                }
            }
        }
        if (t-'0'==4){
            for (int i = 0; i < 4; i++) {
                int xx=x+move[i][0];
                int yy=y+move[i][1];
                if (xx>=0&&xx<n&&yy>=0&&yy<n&&flag[xx][yy]==0){
                    ch[xx][yy]='O';
                    put(xx,yy,flag);
                }
            }dfs(ch,flag,index+1);
        }
        if (t=='X'){
            for (int i = 0; i < 4; i++) {
                int xx=x+move[i][0];
                int yy=y+move[i][1];
                if (xx>=0&&xx<n&&yy>=0&&yy<n&&flag[xx][yy]==0){
                    ch[xx][yy]='O';
                    put(xx,yy,flag);
                    dfs(ch,flag,index+1);
                    ch[xx][yy]='.';
                    pull(xx,yy,flag);
                }
            }
            for (int i = 0; i < 4; i++) {
                int xx=x+move[i][0];
                int yy=y+move[i][1];
                if (xx>=0&&xx<n&&yy>=0&&yy<n&&flag[xx][yy]==0){
                    ch[xx][yy]='O';
                    put(xx,yy,flag);
                    for (int j = i+1; j < 4; j++) {
                        int xxx=x+move[j][0];
                        int yyy=y+move[j][1];
                        if (xxx>=0&&xxx<n&&yyy>=0&&yyy<n&&flag[xxx][yyy]==0){
                            ch[xxx][yyy]='O';
                            put(xxx,yyy,flag);
                            dfs(ch,flag,index+1);
                            ch[xxx][yyy]='.';
                            pull(xxx,yyy,flag);
                        }
                    }
                    dfs(ch,flag,index+1);
                    ch[xx][yy]='.';
                    pull(xx,yy,flag);
                }
            }
            for (int i = 0; i < 4; i++) {
                int xx=x+move[i][0];
                int yy=y+move[i][1];
                if (xx>=0&&xx<n&&yy>=0&&yy<n&&flag[xx][yy]==0){
                    ch[xx][yy]='O';
                    put(xx,yy,flag);
                }
            }
            for (int i = 0; i < 4; i++) {
                int xx=x+move[i][0];
                int yy=y+move[i][1];
                if (xx>=0&&xx<n&&yy>=0&&yy<n&&flag[xx][yy]==0){
                    ch[xx][yy]='.';
                    pull(xx,yy,flag);
                    dfs(ch,flag,index+1);
                    ch[xx][yy]='O';
                    put(xx,yy,flag);
                }
            }
            for (int i = 0; i < 4; i++) {
                int xx=x+move[i][0];
                int yy=y+move[i][1];
                if (xx>=0&&xx<n&&yy>=0&&yy<n&&flag[xx][yy]==0){
                    ch[xx][yy]='O';
                    put(xx,yy,flag);
                }
            }
            dfs(ch,flag,index+1);
        }
    }
    //添加灯泡;
    public static void put(int x,int y,int flag[][]){
        for (int i = x+1; i <n ; i++) {
            if (flag[i][y]==-1){
               break;
            }
            flag[i][y]++;
        }for (int i = x-1; i>=0 ; i--) {
            if (flag[i][y]==-1){
               break;
            }
            flag[i][y]++;
        }
        for (int i = y+1; i <n ; i++) {
            if (flag[x][i]==-1){
                break;
            }
            flag[x][i]++;
        }  for (int i = y-1; i >=0 ; i--) {
            if (flag[x][i]==-1){
                break;
            }
            flag[x][i]++;
        }
    }
    //删除灯泡;
    public static void pull(int x,int y,int flag[][]){
        for (int i = x+1; i <n ; i++) {
            if (flag[i][y]==-1){
               break;
            }
            flag[i][y]--;
        }for (int i = x-1; i>=0 ; i--) {
            if (flag[i][y]==-1){
               break;
            }
            flag[i][y]--;
        }
        for (int i = y+1; i <n ; i++) {
            if (flag[x][i]==-1){
                break;
            }
            flag[x][i]--;
        }  for (int i = y-1; i >=0 ; i--) {
            if (flag[x][i]==-1){
                break;
            }
            flag[x][i]--;
        }
    }
    //判断是否全部点亮;
    public static boolean light(int [][]flag){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (flag[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }
}
