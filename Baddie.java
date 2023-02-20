import java.util.Random;

public class Baddie
{
    private Rectangle badGuy;
    private double xPosition;
    private double yPosition;

    public Baddie(double x, double y)
    {
        xPosition=x;
        yPosition=y;
        badGuy = new Rectangle(xPosition,yPosition,150,300,"RED");
    }

    public void moveBaddie(double moveAmount)
    {
        double nextPosition=badGuy.getXPosition()- moveAmount;
        badGuy.setXPosition(nextPosition);
    }


/**
 * gets random number 0-2, each corresponds to a row
**/
    public int randomStartPosition()
    {
        Random rand = new Random(); 
        int upperbound =3;
        int int_random = rand.nextInt(upperbound);   
        return int_random;
    }

    public void resetPosition(int x ,int y)
    {
        //Baddie[] baddieArray = new Baddie[]
        badGuy.setXPosition(x);
    }

    public boolean reachedEnd()
    {
        if (badguy.getXPosition()==-150)
        {
            return true;
        }

    }

}