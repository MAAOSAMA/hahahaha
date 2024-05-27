package 蓝桥国赛;

public class javac14A {
    static int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String[] args) {
        int day=1;
        int mon=1;
        int week=7;
        int ans=0;
        while(true){
            if (week==1||mon==1||mon/10==1||day%10==1||day/10==1){
                ans+=5;
            }
            else ans+=1;
            day++;
            week++;
            if (day>month[mon]){
                mon++;
                day=1;
            }
            if (week==8){
                week=1;
            }
            if (mon==13){
                break;
            }
        }
        System.out.println(ans);
    }
}
