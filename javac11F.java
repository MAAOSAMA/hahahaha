package 蓝桥国赛;

import java.util.Scanner;

public class javac11F {
    public static void main(String[] args) {
        String[]tian={"geng","xin","ren","gui","jia","yi","bing","ding","wu","ji"};
        String[]di={"shen","you","xu","hai","zi","chou","yin","mao","chen","si","wu","wei"};
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        StringBuilder sb=new StringBuilder();
        int t=a%60;

        sb.append(tian[t%10]);

        sb.append(di[t%12]);

        System.out.println(sb);
    }
}
