import java.util.Scanner;

public class HurdleRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            int t = scanner.nextInt();
            if (t > max)
                max = t;
        }
        if (k > max)
            System.out.println(0);
        else
            System.out.println(max-k);
    }
}
