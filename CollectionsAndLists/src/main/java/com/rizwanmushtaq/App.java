package com.rizwanmushtaq;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
//    collectionsOperationsOnStrings();
//    collectionsOperationsOnBooks();
//    listOperationsOnBooks();
//    treeSetOperations();
//    hashMapOperations();
    takeAnimals(new ArrayList<Animal>());
    takeDogs(new ArrayList<Animal>());
    takeAnimals(new ArrayList<Dog>());
    takeDogs(new ArrayList<>());
    List<Dog> dogs = new ArrayList<>();
    takeDogs(dogs);
    takeSomeAnimals(new ArrayList<Dog>());
    takeSomeAnimals(new ArrayList<>());
    takeSomeAnimals(new ArrayList<Animal>());
    List<Animal> animals = new ArrayList<>();
    takeSomeAnimals(animals);
    List<Object> objects = new ArrayList<>();
    takeObjects(objects);
    takeObjects(new ArrayList<Dog>());
    takeObjects(new ArrayList<Object>());
  }

  private static void takeDogs(List<Dog> dogs) {
  }

  private static void takeCats(List<Cat> cats) {
  }

  private static void takeAnimals(List<Animal> animals) {
  }

  private static void takeSomeAnimals(List<? extends Animal> animals) {
  }

  private static void takeObjects(ArrayList<Object> objects) {
  }
//  private static void hashMapOperations() {
//    Map<String, Integer> scores = new HashMap<>();
//    scores.put("Alice", 85);
//    scores.put("Bob", 90);
//    scores.put("Charlie", 78);
//    System.out.println(scores);
//    System.out.println(scores.get("Bob"));
//  }
//  private static void treeSetOperations() {
//    Book book1 = new Book("Effective Java", "Joshua Bloch", 2001, "978-0134686097", 45.00, "Addison-Wesley");
//    Book book2 = new Book("Clean Code", "Robert C. Martin", 2008, "978-0132350884", 40.00, "Prentice Hall");
//    Book book3 = new Book("Design Patterns", "Erich Gamma", 1994, "978-0201633610", 50.00, "Addison-Wesley");
//    Set<Book> bookSet = new TreeSet<>((b1, b2) -> {
//      int nameComparison = b1.getName().compareTo(b2.getName());
//      if (nameComparison != 0) {
//        return nameComparison;
//      }
//      return Integer.compare(b1.getYearPublished(), b2.getYearPublished());
//    });
//    bookSet.add(book1);
//    bookSet.add(book2);
//    bookSet.add(book3);
//    printBooks("Set Output", bookSet);
//  }
//  private static void collectionsOperationsOnStrings() {
//    List<String> list = new ArrayList<>();
//    list.add("Cherry");
//    list.add("Apple");
//    list.add("Banana");
//    System.out.println("List contents: " + list);
//    // Sorting the list using Collections.sort() It sorts the list in natural order
//    Collections.sort(list);
//    System.out.println("Sorted list: " + list);
//    // Reverse the list using Collections.reverse()
//    Collections.reverse(list);
//    System.out.println("Reversed list: " + list);
//  }
//
//  private static void collectionsOperationsOnBooks() {
//    List<Book> books = new ArrayList<>();
//    books.add(new Book("Effective Java", "Joshua Bloch", 2001, "978-0134686097", 45.00, "Addison-Wesley"));
//    books.add(new Book("Clean Code", "Robert C. Martin", 2008, "978-0132350884", 40.00, "Prentice Hall"));
//    books.add(new Book("Design Patterns", "Erich Gamma", 1994, "978-0201633610", 50.00, "Addison-Wesley"));
//    // Sorting the books by year published
//    Collections.sort(books, (b1, b2) -> Integer.compare(b1.getYearPublished(), b2.getYearPublished()));
//    printBooks("Sorting the books by year published", books);
//    // Sorting the books by price
//    Collections.sort(books, (b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()));
//    printBooks("Sorting the books by price", books);
//  }
//
//  private static void listOperationsOnBooks() {
//    List<Book> books = new ArrayList<>();
//    books.add(new Book("Effective Java", "Joshua Bloch", 2001, "978-0134686097", 45.00, "Addison-Wesley"));
//    books.add(new Book("Clean Code", "Robert C. Martin", 2008, "978-0132350884", 40.00, "Prentice Hall"));
//    books.add(new Book("Design Patterns", "Erich Gamma", 1994, "978-0201633610", 50.00, "Addison-Wesley"));
//    printBooks("original", books);
//    // Sorting the books by name
//    books.sort(Comparator.comparing(Book::getName));
//    printBooks("Sorting the books by name", books);
//    // Sorting the books by author
//    books.sort((b1, b2) -> b1.getAuthor().compareTo(b2.getAuthor()));
//    printBooks("Sorting the books by author", books);
//    // Sorting the books by price
//    books.sort((b1, b2) -> Double.compare(b1.getPrice(), b2.getPrice()));
//    printBooks("Sorting the books by price", books);
//  }
//  public static void printBooks(String message, Set<Book> books) {
//    System.out.println(message);
//    for (Book book : books) {
//      System.out.println("Book: " + book.getName() + ", Author: " + book.getAuthor() + ", Year Published: " + book.getYearPublished() +
//          ", ISBN: " + book.getIsbn() + ", Price: " + book.getPrice() + ", Publisher: " + book.getPublisher());
//    }
//    System.out.println("************************************************************************");
//  }
}

abstract class Animal {
  void eat() {
    System.out.println("Animal is eating");
  }
}

class Dog extends Animal {
  @Override
  void eat() {
    System.out.println("Dog is eating");
  }
}

class Cat extends Animal {
  @Override
  void eat() {
    System.out.println("Cat is eating");
  }
}