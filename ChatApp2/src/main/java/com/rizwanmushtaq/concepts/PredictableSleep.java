package com.rizwanmushtaq.concepts;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PredictableSleep {
  public static void main(String[] args) {
    Runnable job = () -> {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
      System.out.println("Job completed after sleep");
    };
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.execute(job);
    System.out.println("Main thread finished execution");
  }
}
