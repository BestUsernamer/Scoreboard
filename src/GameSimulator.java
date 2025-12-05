import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameSimulator {
    private static final String[] teams = {
            "Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"
    };
    private static Team[] standings = new Team[teams.length];
    public static void main(String[] args) throws FileNotFoundException {
        new GameSimulator(1000);
    }

    public GameSimulator(int games) throws FileNotFoundException {
        for (int i = 0; i < teams.length; i++) {
            standings[i] = new Team(teams[i]);
        }
        play();
        printStandings();

    }
    public void play() throws FileNotFoundException {
        Scanner s = new Scanner(new File("Scoreboard.txt"));
        while (s.next()) {
            String teamOne = s.next();
            String teamTwo = s.next();
            Scoreboard sb= new Scoreboard(teamOne. teamTwo);
            while(s.hasNextInt()) {
                sb.recordPlay(s.nextInt());
            }
        }
    }
}
