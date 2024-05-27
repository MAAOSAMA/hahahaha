package 蓝桥国赛;

import javax.management.MBeanAttributeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class javac13D {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        scan.nextLine();
        long ans=0;
        for (int i = 0; i <T ; i++) {
            String[] s=scan.nextLine().split(" ");
            if (s[0].contains("[]")){
                if (s[0].contains("long")){
                    for (int j = 2; j <s.length ; j++) {
                        int star=s[j].indexOf('[');
                        int end=s[j].indexOf(']');
                        int length=Integer.parseInt(s[j].substring(star+1,end));
                        ans+=8*length;
                    }
                }
                else {
                    for (int j = 2; j <s.length ; j++) {
                        int star=s[j].indexOf('[');
                        int end=s[j].indexOf(']');
                        int length=Integer.parseInt(s[j].substring(star+1,end));
                        ans+=4*length;
                    }
                }
            } else if (s[0].equals("int")){
                String s2[]=s[1].split(",");
                ans+=4*s2.length;
            }else if (s[0].equals("long")){
                String s2[]=s[1].split(",");
                ans+=8*s2.length;
            }
            else {
                String s2[]=s[1].split(",");
                for (int j=0;j<s2.length;j++){
                    int star=s2[j].indexOf("=");
                    ans+=s2[j].length()-star-3;
                }
                ans--;
            }
        }
        StringBuilder sb=new StringBuilder();
        int kb,mb,gb;
        kb=mb=gb=0;
        if (ans/1024>0){
            kb=(int)(ans/1024%1024);
        }
        if (ans/1024>0){
            mb=(int)(ans/1024/1024%1024);
        }if (ans/1024>0){
            gb=(int)(ans/1024/1024/1024);
        }
        ans%=1024;
        if (gb!=0){
            sb.append(gb);
            sb.append("GB");
        }if (mb!=0){
            sb.append(mb);
            sb.append("MB");
        }if (kb!=0){
            sb.append(kb);
            sb.append("KB");
        }
        if (ans!=0){
            sb.append(ans);
            sb.append("B");
        }
        System.out.println(sb);

    }
}
