package 蓝桥国赛;

public class javac11B {
    public static void main(String[] args) {
        int x=2020;
        int ans=0;
        int arr[]=new int[2021];
        for (int i = 2; i <= x; i++) {
            if (arr[i]==0){
            ans++;

        }
            else {
                continue;
            }
            for (int j = 1; j*i <=x ; j++) {

                arr[j*i]=1;
            }
        }
        System.out.println(x-ans);
    }
}
