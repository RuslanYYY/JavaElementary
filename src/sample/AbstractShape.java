package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;
import java.util.Random;

public abstract class AbstractShape implements Shape {

    protected final GraphicsContext gc;

    protected final int WIDTH = 30;
    protected final int HEIGHT = 30;

    protected double x;
    protected double y;
    protected double speedX;
    protected double speedY;

    protected Color color;

    public AbstractShape(GraphicsContext gc) {
        this.gc = gc;
//        Random random = new Random();


        speedX = 17;
        speedY = 17;

        x = Config.WIDTH - WIDTH;
        y = Config.HEIGHT - HEIGHT;
    }

    @Override
    public void move() {
        x += speedX;
        y += speedY;

        if (x <= 0 || x + WIDTH >= Config.WIDTH) {
            speedX = -speedX;
        }
        if (x + x == 0){
            speedX = -speedX;
        }
        if (y + y == 0){
            speedY = -speedY;
        }



        if (y <= 0 || y + HEIGHT >= Config.HEIGHT) {
            speedY = -speedY;
        }
    }
//    public Shape getBounds(){
//        return new Shape(x[0], )
//    }

    @Override
    public void draw() {
        gc.setFill(color);
    }


}



