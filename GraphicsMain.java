package GraphicsWindow;

import Shapes.MazeBorder;
import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.awt.*;
import java.util.Vector;
import java.awt.Frame;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 * Created by SLi on 2016-05-21.
 */

public class GraphicsMain extends JFrame {//class for the window

    private int WinHeight = 500;
    private int WinWidth = 500;
    private int DotSize = 10;
    private int MaxDots = 2500;
    private int RandomPosition;
    private int Delay = 100;
    private int BoardHeight = (int) (WinHeight * 0.9);
    private int BoardWidth = (int) (WinWidth * 0.9);
    private

    public GraphicsMain() { //constructor method

    }

    public GraphicsMain(String windowTitle, Color bg) { // constructor method

        super(windowTitle);
        setSize(WinWidth, WinHeight);
        setBackground(bg);
        setVisible(true);
    }


    public void paint (Graphics g){

    }

}

/*
    private Vector<Shape> shapes = new Vector<>();



    public void addShape(Shape s){
        shapes.add(s);
    }

    public void paint (Graphics g)
    {
        for(int i = 0; i < shapes.size(); i++){
            shapes.get(i).draw(g);
        }


}
*/