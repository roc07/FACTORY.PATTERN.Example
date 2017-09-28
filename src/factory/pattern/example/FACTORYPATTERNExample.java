package factory.pattern.example;

import java.util.ArrayList;

public class FACTORYPATTERNExample {

  public static void displayApartment (String size, Apartment apartment){
    System.out.println(size + " Apartment:");
    System.out.println("Rooms: " + apartment.getRooms());
    System.out.println("Space: " + apartment.getSpace());  
  }
  
  public static void main(String[] args) {
    ApartmentFactory test = new ApartmentFactory();
    
    Apartment small = test.getApartment("small");
    Apartment medium = test.getApartment("medium");
    Apartment large = test.getApartment("large");
    
    displayApartment("small", small);
    displayApartment("medium", medium);
    displayApartment("large", large);
     
  }
  
}
