package base.UI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameFrame extends Frame {

    private GamePanel gamePanel;

    public GameFrame() {
        gamePanel = new GamePanel();

        this.setLayout(new BorderLayout());
        this.add(gamePanel);
        this.setSize(500, 500);
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
