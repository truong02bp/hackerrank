import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[105];
        for (int i=0;i<n;i++)
            a[i] = scanner.nextInt();
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int counter=0;
        for (int i=0;i<n;i++){
            int j=i+1;
            int repeat = m-1;
            int sum=a[i];
            while (j<n && repeat>0){
                sum+=a[j];
                j++;
                repeat--;
            }
            if (repeat ==0 && sum == d)
                counter++;
        }
        System.out.println(counter);
    }
}
