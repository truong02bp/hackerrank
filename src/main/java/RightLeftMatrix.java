import java.util.Scanner;

public class RightLeftMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] a = new int[100][100];
        int n = scanner.nextInt();
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                a[i][j] = scanner.nextInt();
        int right = n-1;
        int sumLeft = 0, sumRight = 0;
        for (int i=0;i<n;i++){
            sumLeft+=a[i][i];
            sumRight+=a[i][right];
            right--;
        }
        System.out.println(Math.abs(sumRight-sumLeft));
    }
}
