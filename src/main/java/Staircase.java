import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int index = n-1;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (j>=index)
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            index--;
            System.out.println();
        }
    }
}
