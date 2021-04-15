import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t>0){
            int n = scanner.nextInt();
            int res = 1;
            for (int i=1;i<=n;i++)
                if (i%2==0)
                    res++;
                else
                    res*=2;
            System.out.println(res);
            t--;
        }
    }
}
