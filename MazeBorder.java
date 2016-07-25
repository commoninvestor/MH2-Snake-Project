package Shapes;

import java.awt.*;

/**
 * Created by SLi on 2016-05-21.
 */
public class MazeBorder extends Shape {

    int xTop = 100;
    int yTop = 100;

    Wall Border[] = new Wall[2];

    public int getxTop() {
        return xTop;
    }

    public void setxTop(int xBottom) {
        this.xTop = xBottom;
    }

    public int getyTop() {
        return yTop;
    }

    public void setyTop(int yBottom) {
        this.yTop = yBottom;
    }
    
    public void draw(Graphics g) {
        for (int i = 0; i < 2; i++) {
            Border[i] = new Wall();
        }
        Border [1].setxCorner(xTop);
        Border [1].setyCorner(yTop);
        Border [1].setHeight(Height);
        Border [1].setWidth(Width);
        Border [1].draw(g);

        xTop = (int)(xTop + (Width - Width*0.9)/2);
        yTop = (int)(yTop + (Height - Height*0.9)/2);
        Width = (int) (Width*0.9);
        Height = (int)(Height*0.9);

        Border [2].setxCorner(xTop);
        Border [2].setyCorner(yTop);
        Border [2].setHeight(Height);
        Border [2].setWidth(Width);
        Border [2].draw(g);

    }

}

