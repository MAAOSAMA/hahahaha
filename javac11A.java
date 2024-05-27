package 蓝桥国赛;

public class javac11A {
    public static void main(String[] args) {
        int ans = 0;
        for (int i = 1; i <= 2020; i++) {
            if (i % 10 == 2 || i / 10 % 10 == 2 || i / 100 % 10 == 2||i/1000==2) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
