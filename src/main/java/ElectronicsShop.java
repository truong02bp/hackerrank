import java.util.*;

public class ElectronicsShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> keyboards = new ArrayList<>();
        List<Integer> drives = new ArrayList<>();
        for (int i=0;i<n;i++)
            keyboards.add(scanner.nextInt());
        for (int i=0;i<m;i++)
            drives.add(scanner.nextInt());
        keyboards.sort((i1, i2) -> i2-i1);
        drives.sort(Comparator.comparingInt(i -> i));
        int j=0;
        int res = -1;
        for (int i=0;i<n;i++){
            if (keyboards.get(i) + drives.get(j) > b)
                continue;
            while (j < m){
                if (keyboards.get(i) + drives.get(j) > b)
                    break;
                if (keyboards.get(i) + drives.get(j) > res)
                    res = keyboards.get(i) + drives.get(j);
                j++;
            }
        }
        System.out.println(res);
    }
}
