package com.rizwanmushtaq.concepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UnpredictableThread {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    executorService.execute(() -> System.out.println("Hello from a thread!"));
    System.out.println("Hello from the main thread!");
    executorService.shutdown();
  }
}
