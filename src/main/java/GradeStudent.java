import java.util.Scanner;

public class GradeStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[100];
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
            if (a[i] > 37){
                int d = a[i]/5;
                d++;
                if (a[i]+3 > 5*d)
                    a[i] = 5*d;
            }
        }
        for (int i=0;i<n;i++)
            System.out.println(a[i]);
    }
}
