import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int arrn[][]=new int [n+1][n];
        int cf[][]=new int[n+2][n+1];
        for (int i=0;i<m;i++){
            int x1=scan.nextInt();
            int y1=scan.nextInt();
            int x2=scan.nextInt();
            int y2=scan.nextInt();
            for (int j=x1;j<=x2;j++){
                cf[j][y1-1]++;
                cf[j][y2]--;
            }
        }
        for (int i = 1; i <=n ; i++) {
            int temp=0;
            for (int j = 0; j <n ; j++) {
                temp+=cf[i][j];
                arrn[i][j]+=temp;
            }
        }
        for (int i=1;i<=n;i++){
            System.out.println(Arrays.toString(arrn[i]).replace(",","").replace("[","").replace("]",""));
        }


    }
}