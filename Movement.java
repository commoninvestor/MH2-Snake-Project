import java.awt.*;

class Movement {
  // make the speedX/ speedY value vary depending on the arrow key that is pressed
  
  public void (int positionX, int positionY, int speedX, int speedY){          // moving pixel positions
       positionX += speedX;                         // must vary depending on which direction the snake moves in
       positionY += speedY;
  }
    }