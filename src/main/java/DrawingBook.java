import java.util.Scanner;

public class DrawingBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int pages = n/2 + 1;
        int flipPage = p/2;
        int turnPage = pages - flipPage - 1;
        System.out.println(Math.min(flipPage, turnPage));
    }
}
