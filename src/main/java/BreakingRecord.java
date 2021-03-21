
import java.util.Scanner;

public class BreakingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[1005];
        for (int i=0;i<n;i++)
            a[i] = scanner.nextInt();
        int minn = a[0];
        int maxx = a[0];
        int resMost = 0, resLeast = 0;
        for (int i=1;i<n;i++) {
            if (a[i] > maxx){
                resMost++;
                maxx = a[i];
            }
            if (a[i] < minn)
            {
                resLeast++;
                minn = a[i];
            }
        }
        System.out.println(resMost + " " + resLeast);
    }
}
