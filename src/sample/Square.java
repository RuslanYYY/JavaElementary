package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.List;

public class Square extends AbstractShape {

    public Square(GraphicsContext gc) {
        super(gc);
        color = Color.GREEN;
    }

    @Override
    public void draw() {
        super.draw();
        gc.fillRect(x, y, WIDTH, HEIGHT);
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
