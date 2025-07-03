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
    Collections.sort(list);
    System.out.println("Sorted list: " + list);
  }
}
