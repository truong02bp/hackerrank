import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {

    private static BigInteger computeFactorial(int n) {
        // create a big number with value n
        BigInteger factorial = new BigInteger(String.valueOf(n));
        if (n == 0 || n == 1)
            return factorial;
        if (n % 2 == 0)
            factorial = factorial.multiply(new BigInteger(String.valueOf(n / 2)));
        // with i, we can specify n-i
        for (int i = 1; i < n / 2; i++)
            factorial = factorial.multiply(new BigInteger(String.valueOf(i * (n - i))));
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị n : ");
        try {
            int n = scanner.nextInt();
            while (n < 0){
                System.out.println("n phải >= 0, hãy nhập lại : ");
                n = scanner.nextInt();
            }
            System.out.println(n + "! = " + computeFactorial(n).toString());
        } catch (InputMismatchException exception) {
            System.out.println("Nhập dữ liệu không hợp lệ !");
        }
    }
}
