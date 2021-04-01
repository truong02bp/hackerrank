import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaleByMatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[105];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            a[i] = scanner.nextInt();
            if (map.get(a[i]) == null)
                map.put(a[i],1);
            else
                map.replace(a[i],map.get(a[i])+1);
        }
        int res = 0;
        for (Map.Entry<Integer,Integer> item : map.entrySet()){
            res += item.getValue()/2;
        }
        System.out.println(res);
    }
}
