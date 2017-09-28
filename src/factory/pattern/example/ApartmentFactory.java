package factory.pattern.example;

public class ApartmentFactory {
  
  public Apartment getApartment(String size){
    if (size == null){
      return null;
    } 
    
    if (size.equalsIgnoreCase("small")){
      return new SmallApartment();
    } else if (size.equalsIgnoreCase("medium")){
      return new MediumApartment();
    } else if (size.equalsIgnoreCase("large")){
      return new LargeApartment();
    }
    
    return null;
  }
  
}
