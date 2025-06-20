package Bicycles;

// This is a simple Java program that demonstrates inheritance
// by creating a Bicycle class and a MountainBike subclass.
public class Main {
  public static void main(String[] args) {
    Bicycle bike01, bike02, bike03;
    bike01 = new Bicycle(20, 10, 1);
    bike02 = new MountainBike(20, 10, 5, "Dual");
    bike03 = new RoadBike(40, 20, 8, 23);
    bike01.printDescription();
    bike02.printDescription();
    bike03.printDescription();
  }
}

class Bicycle {
  private int cadence;
  private int gear;
  private int speed;
  private final int id;
  private static int numberOfBicycles = 0;

  public Bicycle(int startCadence, int startSpeed,
      int startGear) {
    gear = startGear;
    cadence = startCadence;
    speed = startSpeed;
    id = ++numberOfBicycles;
  }

  public int getID() {
    return id;
  }

  public static int getNumberOfBicycles() {
    return numberOfBicycles;
  }

  public int getCadence() {
    return cadence;
  }

  public void setCadence(int newValue) {
    cadence = newValue;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int newValue) {
    gear = newValue;
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

  public void printDescription() {
    System.out.println("Bike is in gear " + this.gear
        + " with a cadence of " + this.cadence
        + " and travelling at a speed of " + this.speed
        + ". ");
  }
}

class MountainBike extends Bicycle {
  private String suspension;

  public MountainBike(int startCadence, int startSpeed,
      int startGear, String suspensionType) {
    super(startCadence, startSpeed, startGear);
    this.suspension = suspensionType;
  }

  public String getSuspension() {
    return this.suspension;
  }

  public void setSuspension(String suspensionType) {
    this.suspension = suspensionType;
  }

  @Override
  public void printDescription() {
    super.printDescription();
    System.out.println("The " + "MountainBike has a "
        + getSuspension() + " suspension.");
  }
}

class RoadBike extends Bicycle {
  // In millimeters (mm)
  private int tireWidth;

  public RoadBike(int startCadence, int startSpeed,
      int startGear, int newTireWidth) {
    super(startCadence, startSpeed, startGear);
    this.tireWidth = newTireWidth;
  }

  public int getTireWidth() {
    return this.tireWidth;
  }

  public void setTireWidth(int newTireWidth) {
    this.tireWidth = newTireWidth;
  }

  @Override
  public void printDescription() {
    super.printDescription();
    System.out.println("The RoadBike" + " has "
        + getTireWidth() + " MM tires.");
  }
}