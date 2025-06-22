package graphics;

public class Main {
  public static void main(String[] args) {
    System.out.println("Graphics application started.");
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    Draggable draggable = new Draggable();
    System.out.println(circle);
    System.out.println(rectangle);
    System.out.println(draggable);
  }
}