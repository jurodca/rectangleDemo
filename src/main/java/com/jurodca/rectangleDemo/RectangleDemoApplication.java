package com.jurodca.rectangleDemo;

import com.jurodca.rectangleDemo.entity.Point;
import com.jurodca.rectangleDemo.entity.Rectangle;
import com.jurodca.rectangleDemo.impl.Operations;
import com.jurodca.rectangleDemo.impl.RectangleOperations;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.Scanner;

@SpringBootApplication
public class RectangleDemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(RectangleDemoApplication.class, args);

    StringBuilder introduction = new StringBuilder();
    Scanner scanner = new Scanner(System.in);
    boolean continueWithExercise = true;

    System.out.println(
        "############################# RECTANGLE EXERCISE ###############################\n");
    introduction
        .append(
            "Given two Rectangles, find if the given two rectangles intersect, one contains to other,\n")
        .append("or if one is adjacent to other. \n")
        .append(
            "Note that a rectangle can be represented by two points, \ntop left and bottom right.")
        .append("Every point has a coordinate (X,Y). \n");

    System.out.println(introduction.toString());

    do {

      System.out.println("Enter the data of Rectangle One ...\n");
      System.out.println("Enter the Top Left Coordinate: \n");
      System.out.println("Coordinate X: \n");
      int coordinateX = scanner.nextInt();
      System.out.println("Coordinate Y: \n");
      int coordinateY = scanner.nextInt();

      Point topLeft = new Point(coordinateX, coordinateY);

      System.out.println("Enter the Bottom Right Coordinate: ");
      System.out.println("Coordinate X: ");
      coordinateX = scanner.nextInt();
      System.out.println("Coordinate Y: ");
      coordinateY = scanner.nextInt();

      Point bottomRight = new Point(coordinateX, coordinateY);

      Rectangle r1 = new Rectangle(topLeft, bottomRight);

      System.out.println("Enter the data of Rectangle Two ...\n");
      System.out.println("Enter the Top Left Coordinate: \n");
      System.out.println("Coordinate X: \n");
      coordinateX = scanner.nextInt();
      System.out.println("Coordinate Y: \n");
      coordinateY = scanner.nextInt();

      topLeft = new Point(coordinateX, coordinateY);

      System.out.println("Enter the Bottom Right Coordinate: ");
      System.out.println("Coordinate X: ");
      coordinateX = scanner.nextInt();
      System.out.println("Coordinate Y: ");
      coordinateY = scanner.nextInt();

      bottomRight = new Point(coordinateX, coordinateY);

      Rectangle r2 = new Rectangle(topLeft, bottomRight);

      analyzeRectangles(r1, r2);

      System.out.println("Do you want to continue entering other triangles? Y / N: \n");
      String answer = scanner.next();

      if (answer.equalsIgnoreCase("N")) {
        continueWithExercise = false;
      }

    } while (continueWithExercise);
  }

  private static void analyzeRectangles(Rectangle r1, Rectangle r2) {
    Operations<Rectangle> operations = new RectangleOperations();

    if (operations.intersect(r1, r2)) {
      System.out.println("The rectangle r1 intersects with rectangle r2\2");
    } else if (operations.contains(r1, r2)) {
      System.out.println("The rectangle r1 contains rectangle r2\n");
    } else if (operations.isAdjacentTo(r1, r2)) {
      System.out.println("The rectangle r1 is adjacent to rectangle r2\n");
    } else {
      System.out.println(
          "Rectangle r1 does not intersect, or does not contain, or is not adjacent to rectangle r2 \n");
    }
  }
}
