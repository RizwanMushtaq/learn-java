package com.rizwanmushtaq;

import java.io.*;

public class App {
  public static void main(String[] args) {
    readFileUsingFileReader();
  }

  private static void readFileUsingFileReader() {
    System.out.println("Reading a file using FileReader!");
    String filePath = "exampleFileWriter.txt";
    try {
      FileReader fileReader = new FileReader(filePath);
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        System.out.print(line);
      }
      fileReader.close();
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  private static void writeUsingFileWriter() {
    System.out.println("Writing using FileWriter!");
    String filePath = "exampleFileWriter.txt";
    try {
      FileWriter fileWriter = new FileWriter(filePath);
      String content = "Hello, World! Rizwan Mushtaq";
      fileWriter.write(content);
      fileWriter.close();
      System.out.println("File written successfully!");
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  private static void writeAFile() {
    System.out.println("Writing a file!");
    String filePath = "exampleFileOutputStream.txt";
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(filePath);
      String content = "Hello, World!";
      fileOutputStream.write(content.getBytes());
      fileOutputStream.close();
      System.out.println("File written successfully!");
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }

  private static void serializePerson() {
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
      FileInputStream fileInputStream = new FileInputStream(filePath);
      ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
      Person deserializedPerson1 = (Person) objectInputStream.readObject();
      Person deserializedPerson2 = (Person) objectInputStream.readObject();
      objectInputStream.close();
      System.out.println("Deserialized Person 1: " + deserializedPerson1);
      System.out.println("Deserialized Person 2: " + deserializedPerson2);
    } catch (Exception exception) {
      exception.printStackTrace();
    }
  }
}
