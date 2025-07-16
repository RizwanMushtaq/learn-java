package com.rizwanmushtaq.raceConditions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RyanAndMonicaTest {
  public static void main(String[] args) {
    BankAccount bankAccount = new BankAccount(100);
    ;
    RyanAndMonicaJob ryanJob = new RyanAndMonicaJob("Ryan", bankAccount,
        50);
    RyanAndMonicaJob monicaJob = new RyanAndMonicaJob("Monica",
        bankAccount, 60);
    ExecutorService executor = Executors.newFixedThreadPool(2);
    executor.execute(ryanJob);
    executor.execute(monicaJob);
    executor.shutdown();
    System.out.println("Final balance: " + bankAccount.getBalance());
  }
}

class RyanAndMonicaJob implements Runnable {
  private final String name;
  private final BankAccount bankAccount;
  private final int amountToSpend;

  public RyanAndMonicaJob(String name, BankAccount bankAccount, int amountToSpend) {
    this.name = name;
    this.bankAccount = bankAccount;
    this.amountToSpend = amountToSpend;
  }

  @Override
  public void run() {
    goShopping(this.amountToSpend, this.name);
  }

  private void goShopping(int amount, String name) {
    System.out.println(name + " is trying to go shopping with amount: " + amount);
    if (this.bankAccount.getBalance() >= this.amountToSpend) {
      System.out.println(name + " has enough balance to go shopping.");
      this.bankAccount.spend(amount, name);
    } else {
      System.out.println(this.name + " cannot go shopping due to insufficient funds.");
    }
  }
}

class BankAccount {
  private int balance;

  public BankAccount(int initialBalance) {
    this.balance = initialBalance;
  }

  public int getBalance() {
    return this.balance;
  }

  public void spend(int amount, String name) {
    if (amount <= balance) {
      this.balance -= amount;
      System.out.println(name + " spent " + amount + ". Remaining balance: " + balance);
    } else {
      System.out.println(name + " tried to spend " + amount + ", but insufficient funds. Balance: " + balance);
    }
  }
}