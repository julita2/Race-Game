public class RunCarGame
{
    public static void main( String[] arguments)
    {
        GameArena g= new GameArena(600, 600);//starts an arena with width 600,600

        Goodie G= new Goodie(250,250);//creates an instance of goodie at position 250,250
        Baddie B1= new Baddie(750,450);//creates an instance of baddie at position 750,450 at the edge of the screen
        Baddie B2= new Baddie(300,500);
        Baddie B3= new Baddie(450,500);

        if(B1.carCollide)
        {
            //game ends
        }

        while(B1.xPosition!=-150)
        {
            B1.moveBaddie(-1);//moves left one
        }

        //Rectangle g= new Ball(100, 100, 30, "CYAN");
         
    }
}
