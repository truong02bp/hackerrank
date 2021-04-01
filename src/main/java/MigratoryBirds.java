import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] birds = new int[1000005];
        Map<Integer,Integer> counter = new HashMap<>();
        for (int i=0;i<n;i++){
            birds[i] = scanner.nextInt();
            if (counter.get(birds[i]) == null)
                counter.put(birds[i],1);
            else
                counter.replace(birds[i],counter.get(birds[i])+1);
        }
        int res = Integer.MAX_VALUE, maxx = Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer> entry : counter.entrySet()){
            if (entry.getValue() > maxx){
                maxx = entry.getValue();
                res = entry.getKey();
            } else
                if (entry.getValue() == maxx)
                    if (entry.getKey() < res)
                        res = entry.getKey();
        }
        System.out.println(res);
    }
}
