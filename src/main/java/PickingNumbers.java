
import java.util.Scanner;

public class PickingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[105];
        for (int i=0;i<n;i++){
            int t = scanner.nextInt();
            a[t]++;
        }
        int res = 1;
        for (int i=1;i<100;i++)
            if (res < (a[i] + a[i-1]))
                res = a[i] + a[i-1];
        System.out.println(res);
    }
}
