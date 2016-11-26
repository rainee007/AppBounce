package jun.test.bounce;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallPanel extends JPanel implements ActionListener{
    private final Color ballColor = Color.LIGHT_GRAY;
    private final int ballDiameter = 60;
    private final Timer timer = new Timer(5, this);
    private final int step = 2;

    private int x = 640 / 2;
    private int y = 440 / 2;
    private int stepX = step;
    private int stepY = step;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(this.ballColor);
        g.fillOval(x, y, ballDiameter, ballDiameter);

        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (x < 0 || x > this.getWidth() - this.ballDiameter) {
            stepX = -stepX;
        }

        if (y < 0 || y > this.getHeight() - this.ballDiameter) {
            stepY = -stepY;
        }
        x += stepX;
        y += stepY;

        if (x > this.getWidth() - this.ballDiameter + this.step) {
            x = this.getWidth() - this.ballDiameter;
        }

        if (y > this.getHeight() - this.ballDiameter + this.step) {
            y = this.getHeight() - this.ballDiameter;
        }

        this.repaint();
    }

    public void restart() {
        this.x = (this.getWidth() - this.ballDiameter) / 2;
        this.y = (this.getHeight() - this.ballDiameter) / 2;
    }
}
