package basics.exo1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Rectangle[] rectangleArray = new Rectangle[3];
    Scanner scanner = new Scanner(System.in);
    System.out.println("You are going to create 3 rectangles!");
    for (int i = 0; i < 3; i++) {
      System.out.println("Rectangle " + (i + 1) + " :");
      System.out.print("Width : ");
      double tempWidth = scanner.nextDouble();
      System.out.print("Height : ");
      double tempHeight = scanner.nextDouble();
      rectangleArray[i] = new Rectangle(tempWidth, tempHeight);
    }
    printRectangles(rectangleArray);
  }

  public static void printRectangles(Rectangle[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println();
      System.out.println("Rectangle " + (i + 1) + " :");
      System.out.println("Width : " + array[i].getWidth());
      System.out.println("Height : " + array[i].getHeight());
    }
  }
}
