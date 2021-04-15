import java.util.Scanner;

public class DesignerPdf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] h = new int[30];
        for (int i=0;i<26;i++)
            h[i] = scanner.nextInt();
        scanner.nextLine();
        String data = scanner.nextLine();
        int res = Integer.MIN_VALUE;
        for (int i=0;i<data.length();i++){
            int value = h[data.charAt(i) - 'a'];
            if (res < value)
                res = value;
        }
        System.out.println(res * data.length());
    }
}
