package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class Main extends Application {

    private GraphicsContext gc;

    private Board board;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Canvas canvas = new Canvas(Config.WIDTH, Config.HEIGHT);

        BorderPane group = new BorderPane();
        group.setCenter(canvas);

        Scene scene = new Scene(group);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello World");
        primaryStage.show();

        gc = canvas.getGraphicsContext2D();
//        createTimer();

        board = new Board(gc);
        registerOnKeyPressListener(scene);


        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.isControlDown()){

                    return;

                }
                if (event.isShiftDown()){
                    board.moveUp();
                    return;

                }
            }
        });
    }

//    private void createTimer() {
//
//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {
//                clean();
//                board.move();
//                board.draw();
//            }
//        };
//
//        Timer timer = new Timer();
//        timer.schedule(task, 300, 300);
//
//    }





    public void registerOnKeyPressListener(Scene scene){
       scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
           @Override
           public void handle(KeyEvent event) {
               switch (event.getCode()){
                   case UP:
                       board.moveUp();
                       System.out.println("UP");

                       break;
                   case RIGHT:
                       board.moveRight();
                       System.out.println("RIGHT");

                       break;
                   case DOWN:
                       board.moveDown();
                       System.out.println("DOWN");

                       break;
                   case LEFT:
                       board.moveLeft();
                       System.out.println("LEFT");

                       break;
                   case DIGIT1:
                       board.appearCircle();
                       break;
                   case DIGIT2:
                       board.appearSquare();
                       break;
                   case DIGIT3:
                       board.appearDouble();
                       break;
                   case PAGE_DOWN:
                       board.previous();
                       break;
                   case PAGE_UP:
                       board.next();
                       break;
//                   case Q:
//                       board.dec();
//                       break;
//                   case W:
//                       board.inc();
//                       break;
                   case DELETE:
                       board.Delete();
                       break;
//                   case S:
//                       saveScene();
//                       break;
//                   case L:
//                       loadScene();
//                       break;
               }
           }
       });
    }

}


