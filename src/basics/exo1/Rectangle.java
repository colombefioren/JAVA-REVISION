package basics.exo1;

public class Rectangle {
  private double width;
  private double height;

  public Rectangle() {
    this(1, 1);
  }

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return this.width * this.height;
  }

  public double getPerimeter() {
    return (this.width + this.height) * 2;
  }

  public double getWidth() {
    return this.width;
  }

  public double getHeight() {
    return this.height;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override

  public String toString() {

      return "Rectangle[width = " + this .width + ", height = " + this.height + "]"
;
  }
}



