import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = scanner.nextInt();
        scanner.nextLine();
        String path = scanner.nextLine();
        int res = 0;
        int lv = 0;
        final int seaLevel = 0;
        for (int i=0;i<steps;i++){
            char c = path.charAt(i);
            if (c == 'U')
                lv++;
            if (c == 'D')
                lv--;
            if (c == 'U' && lv == seaLevel)
                res++;
        }
        System.out.println(res);
    }
}
