import java.util.Scanner;

public class Xoay {

    static int[][] solve(int[][] stone, int m , int n){
        int[][] a = new int[105][105];
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++)
                a[j][i] = stone[m-i-1][j];
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int step = scanner.nextInt();
        int[][] stone = new int[105][105];
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++)
                stone[i][j] = scanner.nextInt();
        for (int i=0;i<step;i++)
            if (i%2==0)
                stone = solve(stone,m,n);
            else
                stone = solve(stone,n,m);
        if (step%2==0)
            for (int i=0;i<m;i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(stone[i][j] + " ");
                System.out.println();
            }
        else
            for (int i=0;i<n;i++) {
                for (int j = 0; j < m; j++)
                    System.out.print(stone[i][j] + " ");
                System.out.println();
            }
    }
}
