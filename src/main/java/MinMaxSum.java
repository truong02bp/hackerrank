import java.util.Scanner;

public class MinMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[6];
        for (int i=0;i<5;i++){
            a[i] = scanner.nextInt();
        }
        int minn=a[0] ,maxx =a[0];
        long sum = a[0];
        for (int i=1;i<5;i++){
            if (a[i] < minn)
                minn = a[i];
            if (a[i] > maxx)
                maxx = a[i];
            sum+=a[i];
        }
        System.out.println((sum-maxx) + " " + (sum-minn));
    }
}
