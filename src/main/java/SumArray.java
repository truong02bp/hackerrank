import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[15];
        long sum = 0;
        int n = scanner.nextInt();
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
