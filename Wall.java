package Shapes;

import java.awt.*;

/**
 * Created by SLi on 2016-05-21.
 */
public class Wall extends Shape{

    public void draw (Graphics g) {
        g.fillRect (xCorner, yCorner, Width, Height);
    }
}
