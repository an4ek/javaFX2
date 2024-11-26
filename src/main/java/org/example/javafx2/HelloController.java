package org.example.javafx2;

import geometry2d.Circle;
import geometry2d.Rectangle;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.paint.Color;

import java.util.Random;


public class HelloController {

    private final int canvasWidth = 900;
    private final int canvasHeight = 600;

    @FXML
    private Canvas canvas = new Canvas();

    private final Random random = new Random();

    @FXML
    private void drawCircle() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double radius = 10 + random.nextDouble() * 30;
        double x = random.nextDouble() * (canvasWidth - radius * 2);
        double y = random.nextDouble() * (canvasHeight - radius * 2);
        Color color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256), 1);
        Circle circle = new Circle(radius, x, y, color);
        circle.draw(gc);
    }

    @FXML
    private void drawRectangle() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double width = 20 + random.nextDouble() * 30;
        double height = 20 + random.nextDouble() * 30;
        double x = random.nextDouble() * (canvasWidth - width);
        double y = random.nextDouble() * (canvasHeight - height);
        Color color = Color.rgb(random.nextInt(256), random.nextInt(256), random.nextInt(256), 1);
        Rectangle rectangle = new Rectangle(width, height, x, y, color);
        rectangle.draw(gc);
    }
}