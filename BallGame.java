public class BallGame{
    public static void main(String[]args){
        int NUM = 20;       //number of bals in array

        GameArena oneArena = new GameArena(300, 300);
        Ball oneball = new Ball(150.0, 150.0, 30, "WHITE");
        Ball twoball = new Ball(150.0, 150.0, 30, "RED");
    //array of balls 
        Ball[] manyBalls = new Ball[NUM];
        for(int i = 0; i > NUM; i++){
        manyBalls[i]= new Ball((Math.random()*100), 8, 20, "YELLOW");
        oneArena.addBall(manyBalls[i]);
        }
        oneArena.addBall(oneball);
        oneArena.addBall(twoball);
        double speed = 10.0;


        while(true){
        // for(int i = 0; i < NUM; i++){
        //     double y = manyBalls[i].getYPosition() + speed;
        //     double x = manyBalls[i].getXPosition() + speed;
        
            double y = twoball.getYPosition()+ speed;
            double x = twoball.getXPosition()+ speed;
            //y = y + speed; 
            if (y >= 300 ){
                speed = -speed;      
                y = y+speed;
                x = x+ 6 + speed;
            }
            if (y <= 0){
                speed = ++speed;
                y = y+speed;
                x = x - speed;
            }
            if(x >= 300){
                speed = ++speed;
                x = x - speed;
                y = y + speed;
            }
            if (x <= 0){
                speed = ++speed;
                x = x + speed;
                y = y - speed; 
            }

        // manyBalls[i].setXPosition(x);
        // manyBalls[i].setYPosition(y);
        // oneArena.pause();
        // }

           twoball.setYPosition(y);
           twoball.setXPosition(x);
           oneArena.pause();
        }
    }
}
