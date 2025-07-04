package com.rizwanmushtaq;

public class Book {
  private String name;
  private String author;
  private int yearPublished;
  private String isbn;
  private double price;
  private String publisher;

  // add a constructor to initialize all fields
  public Book(String name, String author, int yearPublished, String isbn, double price, String publisher) {
    this.name = name;
    this.author = author;
    this.yearPublished = yearPublished;
    this.isbn = isbn;
    this.price = price;
    this.publisher = publisher;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public int getYearPublished() {
    return yearPublished;
  }

  public void setYearPublished(int yearPublished) {
    this.yearPublished = yearPublished;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  @Override
  public String toString() {
    return "Book{" +
        "name='" + name + '\'' +
        ", author='" + author + '\'' +
        ", yearPublished=" + yearPublished +
        ", isbn='" + isbn + '\'' +
        ", price=" + price +
        ", publisher='" + publisher + '\'' +
        '}';
  }
}
