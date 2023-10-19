package football;

public class Scoreboard {
    private Integer timeLeft; // = 50;
    private Integer homeScore; // = 0;
    private Integer awayScore; // = 0;
    private Integer down; // = 1;
    private Integer yardsToFirst; // = 10;
    private Integer yardsToTD; // = 80;

    public Scoreboard(Integer tl, Integer hs, Integer as, Integer d, Integer ytF, Integer ytTD) {
        setTimeLeft(tl);
        setHomeScore(hs);
        setAwayScore(as);
        setDown(d);
        setYardsToFirst(ytF);
        setYardsToTD(ytTD);
    }

    //make setters
    public void setTimeLeft(Integer t) {
        timeLeft=t;
    }

    public void setHomeScore(Integer hs) {
        homeScore=hs;
    }

    public void setAwayScore(Integer as) {
        awayScore=as;

    }
    public void setDown(Integer d) {
        down=d;

    }

    public void setYardsToFirst(Integer ytF) {
        yardsToFirst=ytF;

    }

    public void setYardsToTD(Integer ytTD) {
        yardsToTD=ytTD;
    }


    //make getters
    public Integer getTimeLeft() {
        return timeLeft;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public  Integer getAwayScore() {
        return awayScore;

    }

    public Integer getDown() {
        return down;

    }

    public Integer getYardsToFirst() {
        return yardsToFirst;

    }

    public Integer getYardsToTD() {
        return yardsToTD;
    }
}
