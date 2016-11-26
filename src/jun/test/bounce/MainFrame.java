package jun.test.bounce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MainFrame extends JFrame {
    private BallPanel drawPanel;

    public MainFrame() throws HeadlessException {
        this.setTitle("Ball");
    }


    private void addBallPanel() {
        this.drawPanel = new BallPanel();
        this.drawPanel.setBackground(Color.DARK_GRAY);

        this.add(this.drawPanel, BorderLayout.CENTER);
    }

    private void addRestartButton() {
        JPanel panel = new JPanel();
        JButton buttonRestart = new JButton("Restart");

        buttonRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                drawPanel.restart();
            }
        });

        panel.add(buttonRestart);

        this.add(panel, BorderLayout.SOUTH);
    }

    public void showFrame() {
        this.setLayout(new BorderLayout());

        this.addBallPanel();

        this.addRestartButton();

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(640,500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        drawPanel.restart();
    }
}
