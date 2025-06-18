public class Main {
  public static void main(String[] args) {
    String[] copyFrom = { "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso",
        "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto" };
    String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
    // Print the original array
    printArray(copyFrom);
    // Print the copied array
    printArray(copyTo);
    // Check if the two arrays are equal
    System.out.println("Are two arrays equal? " + java.util.Arrays.equals(copyFrom, copyTo));
  }

  // Generic print method for any type of array
  public static <T> void printArray(T[] array) {
    System.out.println("Array size: " + array.length);
    for (T item : array) {
      System.out.print(item + " ");
    }
    System.out.println('\n');
  }
}