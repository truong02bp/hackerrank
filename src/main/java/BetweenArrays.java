import java.util.Scanner;

public class BetweenArrays {

    static int gcd(int a, int b){
        int temp;
        while (b!=0){
            temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }

    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[105];
        int[] b = new int[105];
        for (int i=0;i<n;i++)
            a[i] = scanner.nextInt();
        for (int i=0;i<m;i++)
            b[i] = scanner.nextInt();
        int bcnn = a[0], ucln = b[0];
        for (int i=1;i<n;i++)
            bcnn = lcm(bcnn,a[i]);
        for (int i=1;i<m;i++)
            ucln = gcd(ucln,b[i]);
        int counter=0;
        for (int i=a[n-1];i<=b[0];i++){
            if (i%bcnn == 0 && ucln%i == 0){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
