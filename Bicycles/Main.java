package Bicycles;

// This is a simple Java program that demonstrates inheritance
// by creating a Bicycle class and a MountainBike subclass.
public class Main {
  public static void main(String[] args) {
    System.out.println("Creating a MountainBike object...");
    MountainBike myBike = new MountainBike(10, 2, 30, 1);
    System.out.println("Seat Height: " + myBike.getHeight());
  }
}

class Bicycle {
  private int cadence;
  private int gear;
  private int speed;

  public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
  }

  public int getCadence() {
    return cadence;
  }

  public void setCadence(int newValue) {
    cadence = newValue;
  }

  public void setGear(int newValue) {
    gear = newValue;
  }

  public int getGear() {
    return gear;
  }

  public int getSpeed() {
    return speed;
  }

  public void applyBrake(int decrement) {
    speed -= decrement;
  }

  public void speedUp(int increment) {
    speed += increment;
  }
}

class MountainBike extends Bicycle {
  private int seatHeight;

  public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
    super(startCadence, startSpeed, startGear);
    seatHeight = startHeight;
  }

  public void setHeight(int newValue) {
    seatHeight = newValue;
  }

  public int getHeight() {
    return seatHeight;
  }
}