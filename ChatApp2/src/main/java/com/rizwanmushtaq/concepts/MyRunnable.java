package com.rizwanmushtaq.concepts;

public class MyRunnable implements Runnable {
  public void run() {
    this.go();
  }

  private void go() {
    this.doMore();
  }

  private void doMore() {
    System.out.println("Doing more work in MyRunnable");
    System.out.println(Thread.currentThread().getName() + " is executing MyRunnable");
    Thread.dumpStack();
  }
}
