import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DayOfTheProgrammer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        List<Integer> months = Arrays.asList(31,28,31,30,31,30,31,31,30,31,30,31);
        if (input > 1918 && input%400 == 0 || (input%4==0 && input%100!=0))
            months.set(1,29);
        else
            if (input == 1918)
                months.set(1,15);
            else
                if (1700 <= input && input <= 1917 && input%4==0)
                    months.set(1,29);
        int dayOfProgrammer = 256;
        int res = 0;
        for (int i=0;i<months.size();i++){
            int days = months.get(i);
            if (dayOfProgrammer > days)
                dayOfProgrammer-=days;
            else {
                res = i+1;
                break;
            }
        }
        String month = "";
        if (res < 10)
            month += "0" + res;
        else
            month += res;
        System.out.println(dayOfProgrammer+"."+month+"."+input);
    }
}
