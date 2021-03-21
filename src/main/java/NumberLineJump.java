import java.util.Scanner;

public class NumberLineJump {

    static boolean result(int x1, int v1, int x2, int v2){
        if (x1 == x2)
            return true;
        int distance = x1>x2 ? x1-x2 : x2-x1;
        if (v1 == v2)
            return false;
        if (x1 > x2 && v1 > v2)
            return false;
        if (x2 > x1 && v2 > v1)
            return false;
        int mod = v1>v2 ? v1-v2 : v2-v1;
        int res = distance > mod ? distance%mod : mod%distance;
        if (res == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();
        if (result(x1,v1,x2,v2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
