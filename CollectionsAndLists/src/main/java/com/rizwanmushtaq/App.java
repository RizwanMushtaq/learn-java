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
    collectionsOperationsOnStrings(list);
    List<Book> books = new ArrayList<>();
    books.add(new Book("Effective Java", "Joshua Bloch", 2001, "978-0134686097", 45.00, "Addison-Wesley"));
    books.add(new Book("Clean Code", "Robert C. Martin", 2008, "978-0132350884", 40.00, "Prentice Hall"));
    books.add(new Book("Design Patterns", "Erich Gamma", 1994, "978-0201633610", 50.00, "Addison-Wesley"));
    printBooks("original", books);
    collectionsOperationsOnBooks(books);
    listOperationsOnBooks(books);
  }

  private static void collectionsOperationsOnStrings(List<String> list) {
    // Sorting the list using Collections.sort() It sorts the list in natural order
    Collections.sort(list);
    System.out.println("Sorted list: " + list);
    // Reverse the list using Collections.reverse()
    Collections.reverse(list);
    System.out.println("Reversed list: " + list);
  }

  private static void collectionsOperationsOnBooks(List<Book> books) {
    // Sorting the books by year published
    Collections.sort(books, (b1, b2) -> Integer.compare(b1.getYearPublished(), b2.getYearPublished()));
    printBooks("Sorting the books by year published", books);
    // Sorting the books by price
    Collections.sort(books, (b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()));
    printBooks("Sorting the books by price", books);
  }

  private static void listOperationsOnBooks(List<Book> books) {
    // Sorting the books by name
    books.sort((b1, b2) -> b1.getName().compareTo(b2.getName()));
    printBooks("Sorting the books by name", books);
    // Sorting the books by author
    books.sort((b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor()));
    printBooks("Sorting the books by author", books);
    // Sorting the books by price
    books.sort((b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()));
    printBooks("Sorting the books by price", books);
  }

  public static void printBooks(String message, List<Book> books) {
    System.out.println(message);
    for (Book book : books) {
      System.out.println("Book: " + book.getName() + ", Author: " + book.getAuthor() + ", Year Published: " + book.getYearPublished() +
          ", ISBN: " + book.getIsbn() + ", Price: " + book.getPrice() + ", Publisher: " + book.getPublisher());
    }
    System.out.println("************************************************************************");
  }
}
