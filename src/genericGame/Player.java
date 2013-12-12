package genericGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class Player extends Mob {

    private int r = 10;

    public Player(int x, int y, int speed) {
        super("Player", x, y);
        this.x = x;
        this.y = y;
    }

    public boolean hasCollided(int dx, int dy) {
        return false;
    }

    public void update() {
        int dx = 0;
        int dy = 0;

        if (input.up.isPressed()) {
            dy--;
        } else if (input.down.isPressed()) {
            dy++;
        } else if (input.left.isPressed()) {
            dx--;
        } else if (input.right.isPressed()) {
            dx++;
        }

        if (dx != 0 || dy != 0) {
            move(dx, dy);
            isMoving = true;
        } else {
            isMoving = false;
        }

        if (x < r) {
            x = r;
        }
        if (y < r) {
            y = r;
        }
        if (x > Game.WIDTH - r) {
            x = Game.WIDTH - r;
        }
        if (y > Game.HEIGHT - r) {
            y = Game.HEIGHT - r;
        }
    }

    public void render(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);

        g.setStroke(new BasicStroke(3));
        g.setColor(Color.GRAY);
        g.drawOval(x - r, y - r, 2 * r, 2 * r);
        g.setStroke(new BasicStroke(1));
    }
}