package Shapes;

import java.awt;
import java.lang.reflect.Modifier;

import Dot;

/**
 * Created by Jethro on 2016-05-21.
 */
public class Snake extends MShape {
    protected int numDots = 3;

    private final int x[] = new int[MaxDots];
    private final int y[] = new int[MaxDots];

    public void grow() {
        SnakeLength += 1
    }


    public void draw() {

        for (int i = 0; i < MaxDots; i++) {
            Dot d[ i]=new Dot;
            d[i].draw(x[i], y[i]);
        }

    }

    public void move() {

        for (int i = numDots; i > 0; i--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }

        if (left) {
            x[0] = x[0] - DotSize;
        }

        if (right) {
            x[0] = x[0] + DotSize;
        }

        if (up) {
            y[0] = y[0] - DotSize;
        }

        if (down) {
            y[0] = y[0] + DotSize;
        }
    }


}
