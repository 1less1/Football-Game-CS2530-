package football;

public class CoachAndy implements Coach {
    @Override
    public Integer callOffensivePlay(Scoreboard situation) {
        return 2;
    }

    @Override
    public Integer callDefensivePlay(Scoreboard situation) {
        return 2;
    }

    @Override
    public void opponentsLastOffensivePlayCall(Integer call) {

    }

    @Override
    public void opponentsLastDefensivePlayCall(Integer call) {

    }
}
