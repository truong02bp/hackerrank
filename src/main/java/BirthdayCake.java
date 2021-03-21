import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BirthdayCake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        int n = scanner.nextInt();
        int maxx = 0;
        for (int i=0;i<n;i++){
            int temp = scanner.nextInt();
            if (temp > maxx)
                maxx = temp;
            if (!map.containsKey(temp))
                map.put(temp,1);
            else
                map.replace(temp,map.get(temp)+1);
        }
        System.out.println(map.get(maxx));
    }
}
