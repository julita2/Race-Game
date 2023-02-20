public class RunCarGame
{
    public static void main( String[] arguments)
    {
        GameArena g= new GameArena(600, 600);//starts an arena with width 600,600

        Goodie G= new Goodie(250,250);//creates an instance of goodie at position 250,250
        //Baddie B1= new Baddie(750,450);//creates an instance of baddie at position 750,450 at the edge of the screen
        //Baddie B2= new Baddie(300,500);
        //Baddie B3= new Baddie(450,500);

        Baddie[] baddies= new Baddie[3];

        baddies[0]= new Baddie(750,450);
        baddies[1]= new Baddie(300,500);
        baddies[2]= new Baddie(450,500);
        

        baddies[0]= new Baddie(750,450);
        baddies[1]= new Baddie(300,500);
        baddies[2]= new Baddie(450,500);

        //if(baddies[0].carCollide)
        //{
            //game ends
        //}

        if (baddies[0].getXPosition()== 0)
        {
            baddies[0].setXPosition(750);
            baddies[0].setYPosition(450);
        }

        if (baddies[1].getXPosition()== 0)
        {
            baddies[1].setXPosition(300);
            baddies[1].setYPosition(500);
        }

        if (baddies[2].getXPosition()== 0)
        {
            baddies[2].setXPosition(450);
            baddies[2].setYPosition(500);
        }
        while(baddies[0].getXPosition()!=-150)
        {
            baddies[0].moveBaddie(-1);//moves left one
        }

        //Rectangle g= new Ball(100, 100, 30, "CYAN");
         
    }
}
