package factory.pattern.example;

import java.util.Random;

public class LargeApartment implements Apartment{

  private int numberOfRooms;
  private double totalSpace;
  
  public LargeApartment(){
    createRooms();
    calculateRandomSpace();
  }
    
  @Override
  public void createRooms() {
    Random numRooms = new Random();
    this.numberOfRooms = 3 + numRooms.nextInt(3);
  }

  @Override
  public void calculateRandomSpace() {
    Random space = new Random();
    this.totalSpace = 12d + space.nextDouble() * 28d;
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
