public class RunClient{
   
   public static void main(String[] args){
      Bike b = new Bike(12, "blue");
            
      System.out.println(Bike.getGears());
      System.out.println(Bike.getColor());
      
      Bike.ride();
      System.out.println(Bike.riding);
      }
}