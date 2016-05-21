package GraphicsWindow.Shape;

import java.awt.*;

/**
 * Created by SLi on 2016-05-19.
 */

public abstract class Shape {

    protected int Height = 100;
    protected int Width = 100;
    protected Color Colour = Color.CYAN;
    protected int xCentre = 500;
    protected int yCentre = 500;

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public Color getColour() {
        return Colour;
    }

    public void setColour(Color colour) {
        Colour = colour;
    }

    public int getxCentre() {
        return xCentre;
    }

    public void setxCentre(int xCentre) {
        this.xCentre = xCentre;
    }

    public int getyCentre() {
        return yCentre;
    }

    public void setyCentre(int yCentre) {
        this.yCentre = yCentre;
    }

    public abstract void draw (Graphics g);

    public void erase (Graphics g){
        Color OldColour = getColour ();
        setColour(Color.white);
        draw(g);
        setColour(OldColour);
    }


}
