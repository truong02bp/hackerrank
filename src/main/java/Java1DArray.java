import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            int n = scanner.nextInt();
            int leap = scanner.nextInt();
            int[] game = new int[105];
            for (int i=0;i<n;i++)
                game[i] = scanner.nextInt();
            Queue<Integer> queue = new LinkedList();
            queue.offer(0);
            boolean winner = false;
            while (!queue.isEmpty()){
                int value = queue.poll();
                if (value == n-1 || value+leap >= n){
                    winner = true;
                    break;
                }
                if (value-1 > -1 && game[value-1] == 0){
                    queue.add(value-1);
                    game[value-1] = 1;
                }
                if (value+1 < n && game[value+1]==0){
                    game[value+1] = 1;
                    queue.add(value+1);

                }
                if (value + leap < n && game[value+leap]==0) {
                    queue.add(value+leap);
                    game[value+leap]=1;
                }

            }
            if (!winner)
                System.out.println("NO");
            else
                System.out.println("YES");
            t--;
        }
    }
}
