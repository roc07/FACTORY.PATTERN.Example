package factory.pattern.example;

import java.util.Random;

public class SmallApartment implements Apartment{

  private int numberOfRooms;
  private double totalSpace;
  
  public SmallApartment(){
    createRooms();
    calculateRandomSpace();
  }
  
  @Override
  public void createRooms() {
    Random numRooms = new Random();
    this.numberOfRooms = 1 + numRooms.nextInt(1);
  }

  @Override
  public void calculateRandomSpace() {
    Random space = new Random();
    this.totalSpace = 8d + space.nextDouble() * 20d;

  }

  @Override
  public int getRooms() {
    return this.numberOfRooms;
  }

  @Override
  public double getSpace() {
    return this.totalSpace;
  }

}
