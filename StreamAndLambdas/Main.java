import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Zaid", "John", "Alice", "Bob", "Charlie",
        "David");
    printNamesWithA(names);
    printNamesWithLimit2(names);
    printNamesWithSorted(names);
  }

  public static void printNamesWithA(List<String> names) {
    System.out.println("--- Filtered Names ---");
    List<String> filteredNames =
        names.stream()
            .filter(name -> name.startsWith("A"))
            .collect(Collectors.toList());
    filteredNames.forEach(System.out::println);
  }

  public static void printNamesWithLimit2(List<String> names) {
    System.out.println("--- Limited Names ---");
    List<String> limitedNames =
        names.stream()
            .sorted()
            .skip(3)
            .limit(2)
            .collect(Collectors.toList());
    limitedNames.forEach(System.out::println);
  }

  public static void printNamesWithSorted(List<String> names) {
    System.out.println("--- Sorted Names ---");
    List<String> sortedNames =
        names.stream()
            .sorted()
            .collect(Collectors.toList());
    sortedNames.forEach(System.out::println);
  }
}