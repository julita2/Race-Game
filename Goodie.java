public class Goodie{
    private double xPosition;
    private double yPosition;
    private Rectangle goodGuy;
    /**Constructer method
    *@param x takes the x position
    *@param y takes the y position
    */
    public void Goodie(double x, double y){
        xPosition = x;
        yPosition = y;
        goodGuy = new Rectangle(xPosition, yPosition, 300, 150, "GREEN");
    }
    /**@param g Makes the game arena */

    public void addTo(GameArena g) {
        g.addRectangle(goodGuy);
    }
    /**
     *
     * Reads y and x position and sets new position
     * @param x gets input position to move forward or back
     * @param y gets input to move up or down
     */

    public void moveUp(double y){
        double yPos = goodGuy.getYPosition();
        yPos = yPos + y;
        yPosition = yPos;

        if(yPosition == 600){
            yPosition = 0;
        }    
    }
    public void moveDown(double y){
        double yPos = goodGuy.getYPosition();
        yPos = yPos - y;
        yPosition = yPos;
        if(yPosition == 600 || yPosition == 0){
            yPosition = 0;
        }
    }

    public void move(double x, double y){
        double yPos = goodGuy.getYPosition();
        double xPos = goodGuy.getXPosition();
        yPos = yPos+y;
        xPos = xPos+x;
        yPosition = yPos;
        xPosition = xPos;
        if(yPosition == 600){
            yPosition = 0;
        }
        if(xPosition == 600){
            xPosition = 0;
        }
    }
}