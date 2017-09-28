package factory.pattern.example;

import java.util.Random;

public class MediumApartment implements Apartment{

  private int numberOfRooms;
  private double totalSpace;
  
  public MediumApartment(){
    createRooms();
    calculateRandomSpace();
  }
    
  @Override
  public void createRooms() {
    Random numRooms = new Random();
    this.numberOfRooms = 2 + numRooms.nextInt(2);
  }

  @Override
  public void calculateRandomSpace() {
    Random space = new Random();
    this.totalSpace = 9d + space.nextDouble() * 22d;
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
