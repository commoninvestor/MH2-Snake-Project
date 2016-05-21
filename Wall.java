package Shapes;

import java.awt.*;

/**
 * Created by SLi on 2016-05-21.
 */
public class Wall extends Shape{

    protected int xCorner = 100;
    protected int yCorner = 100;

    public int getxCorner() {
        return xCorner;
    }

    public void setxCorner(int xCorner) {
        this.xCorner = xCorner;
    }

    public int getyCorner() {
        return yCorner;
    }

    public void setyCorner(int yCorner) {
        this.yCorner = yCorner;
    }

    public void draw (Graphics g) {
        g.fillRect (xCorner, yCorner, Width, Height);
    }
}
