package Shapes;

/**
 * Created by Jethro on 2016-05-21.
 */

public class MShape extends Shape {
    private int dx = 10;
    private int dy = 10;

    public void slide(int direction) {
        erase();
        if (direction == 1) {
            xCentre = xCentre + dx;
        } else if (direction == 2) {
            xCentre = xCentre - dx;
        } else if (direction == 3) {
            yCentre = yCentre - dy;
        } else if (direction == 4) {
            yCentre = yCentre + dy;
        }
        draw();
        delay(50);
    }
}
