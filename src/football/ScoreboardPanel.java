package football;

import javax.swing.*;
import java.awt.*;

public class ScoreboardPanel extends JPanel {

    private JLabel homeScoreLabel;
    private JLabel awayScoreLabel;

    private JLabel downLabel;

    private JLabel yardsToFirstLabel;

    private JLabel yardsToTDLabel;

    Scoreboard sb;

    public ScoreboardPanel(Scoreboard sb) {
        setLayout(new GridLayout(6, 1)); //6 rows of text and 1 column for those rows
        this.sb = sb;
        homeScoreLabel = new JLabel("Home Score: "+sb.getHomeScore());
        awayScoreLabel = new JLabel("Away Score: "+sb.getAwayScore());
        downLabel= new JLabel("Down: "+sb.getDown());
        yardsToFirstLabel = new JLabel("Yards to First: "+sb.getYardsToFirst());
        yardsToTDLabel = new JLabel("Yards to Touchdown: "+sb.getYardsToTD());

        add(homeScoreLabel);
        add(awayScoreLabel);
        add(downLabel);
        add(yardsToFirstLabel);
        add(yardsToTDLabel);

    }


}
