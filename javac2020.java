package 蓝桥国赛;

public class javac2020 {
    public static void main(String[] args) {
        int ans=1;
        for (int i=10;i<=2020;i++){
            if (i<100){
                if (i%10==2||i/10==2){
                    ans++;
                }
            }
            else if (i<1000) {
                if (i%10==2||i/10%10==2||i/100==2) {
                    ans++;
                }
            }
            else{
                if (i/1000==2||i%10==2||i/10%10==2||i/100%10==2) {
                    ans++;
                    System.out.println(i);
                }
            }
        }
        System.out.println(ans);
    }
}
