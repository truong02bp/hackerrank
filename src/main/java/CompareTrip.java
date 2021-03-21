import java.util.Scanner;

public class CompareTrip {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int pointsA = 0, pointsB = 0;
        for (int i=0;i<3;i++)
            a[i] = scanner.nextInt();
        for (int i=0;i<3;i++){
            b[i] = scanner.nextInt();
            if (b[i] > a[i])
                pointsB++;
            else
                if (b[i] < a[i])
                    pointsA++;
        }
        System.out.println(pointsA + " " + pointsB);
    }

}
