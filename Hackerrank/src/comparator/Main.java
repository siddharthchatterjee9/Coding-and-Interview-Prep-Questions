package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
    String name;
    int score;
    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        }
        else {
            return ((Integer) b.score).compareTo(a.score);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Player[] players = new Player[n];
        Checker checker = new Checker();
        for (int i = 0; i < n; i++) {
            players[i] = new Player(in.next(), in.nextInt());
        }
        in.close();
        Arrays.sort(players, checker);
        for (int j = 0; j < players.length; j++) {
            System.out.printf("%s %s\n", players[j].name, players[j].score);
        }
    }
}
