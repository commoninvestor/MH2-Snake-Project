package Shapes;
import java.awt.*;

/**
 * Created by Jethro on 2016-05-21.
 */

public abstract class MShape extends Shape {

    private int dx = 10;
    private int dy = 10;

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public void slide(Graphics g, int direction) {
        erase(g);
        if (direction == 1) {
            xCentre = xCentre + dx;
        } else if (direction == 2) {
            xCentre = xCentre - dx;
        } else if (direction == 3) {
            yCentre = yCentre - dy;
        } else if (direction == 4) {
            yCentre = yCentre + dy;
        }
        draw(g);
        delay(50);
    }
}
