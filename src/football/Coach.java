package football;

public interface Coach {
    Integer callOffensivePlay(Scoreboard situation);
    Integer callDefensivePlay(Scoreboard situation);

    void opponentsLastOffensivePlayCall(Integer playCall);
    void opponentsLastDefensivePlayCall(Integer playCall);
}
