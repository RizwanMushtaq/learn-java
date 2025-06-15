import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int x, y, sum;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    x = scanner.nextInt();
    System.out.print("Enter second number: ");
    y = scanner.nextInt();
    sum = x + y;
    System.out.println("The sum of " + x + " and " + y + " is: " + sum);
    scanner.close();
  }
}
