import java.util.Scanner;

public class TimeConversion {

    static String solve(String item){
        int value = Integer.parseInt(item) + 12;
        return String.valueOf(value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeInput = scanner.nextLine();
        String[] items = timeInput.split(":");
        String lastItem = items[items.length-1];
        String start = "";
        if (lastItem.endsWith("AM")){
            if (items[0].equals("12"))
                start = "00";
            else
                start = items[0];
        }
        else
            if (lastItem.endsWith("PM")) {
                if (items[0].equals("12"))
                    start = "12";
                else
                    start = solve(items[0]);
            }
        StringBuilder res = new StringBuilder(start);
        for (int i=1;i<items.length;i++)
            res.append(":").append(items[i]);
        System.out.println(res.substring(0,res.length()-2));
    }
}
