import java.util.Scanner;

public class DivisionSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[105];
        int[] store = new int[105];
        for (int i=0;i<105;i++)
            store[i] = 0;
        for (int i=0;i<n;i++)
            a[i] = scanner.nextInt();
        int counter = 0;
        for (int i=0;i<n;i++){
            counter+=store[(k-(a[i]%k))%k];
            store[a[i]%k]++;
        }
        System.out.println(counter);
    }
}
