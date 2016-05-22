import java.awt.*;

class Game {
  public static void main (String [] args){
    
      public void draw (Graphics g) {
        g.fillOval(xCorner, yCorner, width, height); // draw a coloured circle
    }
      Thread.sleep(1000);
      
      public void draw (Graphics g) {
        g.fillOval(xCorner, yCorner, width, height); // draw a white circle (we are animating the snake head)
        
    Movement snake = new Movement ();          // creating a new reference variable
    snake.Movement(positionX, positionY, speedX, speedY);
    }
  }}