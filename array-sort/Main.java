import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String[] array = { "banana", "apple", "orange", "kiwi" };
    System.out.println("Original array:");
    for (String fruit : array) {
      System.out.print(fruit + " ");
    }
    Arrays.sort(array);
    System.out.println("\nSorted array:");
    for (String fruit : array) {
      System.out.print(fruit + " ");
    }
  }
}
