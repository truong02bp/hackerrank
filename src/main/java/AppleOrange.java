import java.util.Scanner;

public class AppleOrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] apples = new int[1000005];
        int[] oranges = new int[1000005];
        int resA = 0, resO = 0;
        for (int i=0;i<m;i++){
            apples[i] = scanner.nextInt();
            int value = a + apples[i];
            if (s <= value &&  value <= t)
                resA++;
        }
        for (int i=0;i<n;i++) {
            oranges[i] = scanner.nextInt();
            int value = b + oranges[i];
            if (s <= value &&  value <= t)
                resO++;
        }
        System.out.println(resA);
        System.out.println(resO);
    }
}
