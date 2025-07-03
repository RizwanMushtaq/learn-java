package com.rizwanmushtaq;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Cherry");
    list.add("Apple");
    list.add("Banana");
    System.out.println("List contents: " + list);
    collectionsClassOperations(list);
  }

  private static void collectionsClassOperations(List<String> list) {
    // Sorting the list using Collections.sort() It sorts the list in natural order
    Collections.sort(list);
    System.out.println("Sorted list: " + list);
    // Reverse the list using Collections.reverse()
    Collections.reverse(list);
    System.out.println("Reversed list: " + list);
  }
}
