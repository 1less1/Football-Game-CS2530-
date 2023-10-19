package football;

import javax.swing.*;
import java.awt.*;

public class ScoreboardPanelDriver {
    public static void main(String[] args) {
        Scoreboard SB= new Scoreboard(50,0,0,1,10,80);

        JFrame sbp = new JFrame("Basic Scoreboard");
        sbp.setLayout(new FlowLayout());

        sbp.add(new ScoreboardPanel(SB));

        sbp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sbp.setSize(200,300);

        sbp.setVisible(true);
    }
}
