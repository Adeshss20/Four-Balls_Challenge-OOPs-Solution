import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    Ball b1 = new Ball(20,new Coordinate(0,HEIGHT/5));
    Ball b2 = new Ball(20,new Coordinate(0,HEIGHT*2/5));
    Ball b3 = new Ball(20,new Coordinate(0,HEIGHT*3/5));
    Ball b4 = new Ball(20,new Coordinate(0,HEIGHT*4/5));

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge",args);
    }

    public void setupBallInSpace(Ball b) {
        ellipse(b.c.getXcoordinate(),b.c.getYcoordinate(),b.diameter,b.diameter);
    }

    public void moveBallFromLeftToRight(Ball b, int speed) {
        ellipse(b.c.getXcoordinate(),b.c.getYcoordinate(),b.diameter,b.diameter);
        b.c.updateXcoordinate(speed);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        setupBallInSpace(b1);
        setupBallInSpace(b2);
        setupBallInSpace(b3);
        setupBallInSpace(b4);
    }

    @Override
    public void draw() {
        moveBallFromLeftToRight(b1, 1);
        moveBallFromLeftToRight(b2, 2);
        moveBallFromLeftToRight(b3, 3);
        moveBallFromLeftToRight(b4, 4);
    }
}
