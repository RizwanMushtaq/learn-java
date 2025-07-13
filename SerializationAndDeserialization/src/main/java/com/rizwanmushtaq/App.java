package com.rizwanmushtaq;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class App {
  public static void main(String[] args) {
    System.out.println("Serialization And De-Serialization!");
    Person person1 = new Person("John Doe", 30);
    Person person2 = new Person("Jane Smith", 25);
    String filePath = "person.ser";
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(filePath);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(person1);
      objectOutputStream.writeObject(person2);
      objectOutputStream.close();
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }
}
