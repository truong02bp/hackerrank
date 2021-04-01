import java.util.Scanner;

public class BillDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k =scanner.nextInt();
        int[] a = new int[100005];
        int sum=0;
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
            if (i != k)
                sum+=a[i];
        }
        int charged = scanner.nextInt();
        int res = charged - sum/2;
        if (res == 0)
            System.out.println("Bon Appetit");
        else
            System.out.println(res);
    }
}
