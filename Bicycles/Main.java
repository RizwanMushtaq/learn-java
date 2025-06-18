package Bicycles;

// This is a simple Java program that demonstrates inheritance
// by creating a Bicycle class and a MountainBike subclass.
public class Main {
  public static void main(String[] args) {
    System.out.println("Creating a MountainBike object...");
    MountainBike myBike = new MountainBike(10, 2, 30, 1);
    System.out.println("Seat Height: " + myBike.seatHeight);
  }
}

class Bicycle {
  // the Bicycle class has
  // three fields
  public int cadence;
  public int gear;
  public int speed;

  // the Bicycle class has
  // one constructor
  public Bicycle(int startCadence, int startSpeed, int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
  }

  // the Bicycle class has
  // four methods
  public void setCadence(int newValue) {
    cadence = newValue;
  }

  public void setGear(int newValue) {
    gear = newValue;
  }

  public void applyBrake(int decrement) {
    speed -= decrement;
  }

  public void speedUp(int increment) {
    speed += increment;
  }
}

class MountainBike extends Bicycle {
  // the MountainBike subclass has
  // one field
  public int seatHeight;

  // the MountainBike subclass has
  // one constructor
  public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
    super(startCadence, startSpeed, startGear);
    seatHeight = startHeight;
  }

  // the MountainBike subclass has
  // one method
  public void setHeight(int newValue) {
    seatHeight = newValue;
  }
}