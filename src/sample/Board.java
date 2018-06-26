package sample;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final GraphicsContext gc;
    Circle shape;
    Square square;
    DoubleCircle doubleC;

//    Square.shape;
//    List<Shape> shapes = new ArrayList<>();

    public Board(GraphicsContext gc) {
        this.gc = gc;
//        for (int i = 0; i < 10; i++) {
//            shapes.add(new Circle(gc, shapes));
//            shapes.add(new DoubleCircle(gc, shapes));
//            shapes.add(new Square(gc, shapes));
//        }
        shape = new Circle(gc);
        doubleC = new DoubleCircle(gc);
        square = new Square(gc);
//        shape = new Square(gc);
    }
    public void moveLeft(){
        clean();
        shape.moveLeft();
        doubleC.moveLeft();
        square.moveLeft();
        square.draw();
        doubleC.draw();
        shape.draw();

    }

    public void moveRight(){
        clean();
        shape.moveRight();
        doubleC.moveRight();
        square.moveRight();
        shape.draw();
        doubleC.draw();
        square.draw();



    }

    public void moveUp(){
        clean();
        shape.moveUp();
        doubleC.moveUp();
        square.moveUp();
        shape.draw();
        doubleC.draw();
        square.draw();

    }

    public void moveDown(){
        clean();
        shape.moveDown();
        doubleC.moveDown();
        square.moveDown();
        shape.draw();
        doubleC.draw();
        square.draw();

    }

    public void appearCircle(){
        shape.draw();

    }
    public void appearSquare(){
        square.draw();

    }
    public void appearDouble(){

        doubleC.draw();
    }
    public void Delete(){

        clean();
    }
    public void next(){
        this.square.draw();

    }
    public void previous(){

    }


    private void clean() {
        gc.clearRect(0, 0, Config.WIDTH, Config.HEIGHT);
    }

//    public void move() {
//        for (Shape shape : shapes) {
//            shape.move();
//        }
//    }
//
//    public void draw() {
//        for (Shape shape : shapes) {
//            shape.draw();
//        }
//    }


//    public static enum Direction {
//        UP,
//        RIGHT,
//        DOWN,
//        LEFT;
//    }
}

