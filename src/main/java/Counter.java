import java.util.Scanner;

public class Counter {

    static int counter = 0;

    public static int k = 0;

    public static int n = 0;

    public static int[] a = new int[100];

    public static String result = "";

    static void Try(int count, int i){
        if (i >= n)
            return;
        for (int j=0;j<10;j++)
            if (count <= k){
                count+=j;
                result = result + j;
                if (count == k){
                    counter++;
                    System.out.println(result);
                }
                Try(count,i+1);
                result = result.substring(0,result.length()-1);
                count-=j;
            }
    }
    static void print(int t){
        for (int i=0;i<t;i++)
            System.out.print(a[i]);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        for (int i=1;i<10;i++){
            if (i == k){
                counter++;
            }
            result = String.valueOf(i);
            Try(i,1);
        }
        System.out.println(counter);
    }
}
