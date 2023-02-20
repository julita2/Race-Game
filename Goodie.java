public class Goodie{
    private double xPosition;
    private double yPosition;
    private Rectangle goodGuy;
    /**Constructer method
    *@param x takes the x position
    *@param y takes the y position
    */
    public Goodie(double x, double y){
        xPosition = x;
        yPosition = y;
        goodGuy = new Rectangle(x, y, 300, 150, "GREEN");
    }
    /**@param g Makes the game arena */

    public addTo(GameArena g) {
        g.addRectangle(goodGuy);
    }
    /**
     * Reads y and x position and sets new position
     * @param x gets input position to move forward or back
     * @param y gets input to move up or down
     */
    public move(double x, double y){
        double yPos = goodGuy.yPosition;
        double xPos = goodGuy.xPosition;
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