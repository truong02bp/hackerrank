import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JavaComparator {

    static class Player implements Comparable<Player> {
        String name;
        int score;

        @Override
        public int compareTo(Player player) {
            if (this.score != player.score)
                return this.score-player.score;
            return this.name.compareTo(player.name);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Player> players = new ArrayList();
        for (int i=0;i<n;i++){
            Player player = new Player();
            player.name = scanner.nextLine();
            player.score = scanner.nextInt();
            scanner.nextLine();

            players.add(player);
        }
        players.sort(Comparator.reverseOrder());
        players.forEach(player -> {
            System.out.println(player.name + " " + player.name);
        });
    }
}
