package com.rizwanmushtaq.concepts;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PredictableLatch {
  public static void main(String[] args) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    CountDownLatch latch = new CountDownLatch(1);
    executor.execute(() -> waitForLatchThenPrint(latch));
    System.out.println("Main thread is doing some work before releasing the latch.");
    latch.countDown();
    executor.shutdown();
  }

  private static void waitForLatchThenPrint(CountDownLatch latch) {
    try {
      latch.await(); // Wait for the latch to count down to zero
      System.out.println("Latch released, proceeding with execution.");
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      System.err.println("Thread was interrupted while waiting for latch.");
    }
    System.out.println("Inside the thread after latch release.");
  }
}
