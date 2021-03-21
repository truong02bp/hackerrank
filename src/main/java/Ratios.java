import java.util.Scanner;

public class Ratios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[105];
        int n = scanner.nextInt();
        double positive=0,negative=0,zero=0;
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
            if (a[i]>0)
                positive+=1;
            else
                if (a[i] == 0)
                    zero+=1;
                else
                    negative+=1;
        }
        System.out.printf("%.6f",positive/n);
        System.out.println();
        System.out.printf("%.6f",negative/n);
        System.out.println();
        System.out.printf("%.6f",zero/n);
        System.out.println();
    }
}
