import java.util.Scanner;

public class CatsAndMouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t>0){
            int x  = scanner.nextInt();
            int y  = scanner.nextInt();
            int z  = scanner.nextInt();
            String res = "";
            int distanceA = Math.abs(x-z);
            int distanceB = Math.abs(y-z);
            if (distanceA > distanceB)
                res = "Cat B";
            else
            if (distanceA == distanceB)
                res = "Mouse C";
            else
                res = "Cat A";
            System.out.println(res);
            t--;
        }
    }
}
