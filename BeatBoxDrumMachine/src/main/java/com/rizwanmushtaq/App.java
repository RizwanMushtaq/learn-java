package com.rizwanmushtaq;

public class App {
  public static void main(String[] args) {
    MusicTest1 musicTest = new MusicTest1();
    try {
      musicTest.play();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
