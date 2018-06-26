package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class Circle extends AbstractShape {

    public Circle(GraphicsContext gc) {
        super(gc);
        color = Color.RED;
    }

    @Override
    public void draw() {
        super.draw();
        gc.fillOval(x, y, WIDTH, HEIGHT);
    }

    void moveLeft(){
        x -= speedX;

    }
    void moveRight(){
        x += speedX;

    }
    void moveUp(){
        y -= speedY;

    }
    void moveDown(){
        y += speedY;

    }


}
