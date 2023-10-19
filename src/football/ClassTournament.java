package football;

import java.util.ArrayList;

public class ClassTournament {
    public static void main(String[] args) {
        ArrayList<Coach> coaches = new ArrayList<>();

        // Add the various coaches
        coaches.add(new CoachAndy());
        //coaches.add(new CoachFienup());

        for(Coach c : coaches) {
            createAwayGames(c, coaches);
        }
    }

    // We call this a helper method - it exists to do a little extra work
    // for some other method.
    private static void createAwayGames(Coach away, ArrayList<Coach> coaches) {
        for(Coach home : coaches ) {
            //Game g = new Game(home, away);
            //g.playGame();
        }
    }
}
