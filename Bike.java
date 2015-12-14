public class Bike{
   private static String color;
   private static int gears;
   public static String riding;
   public Bike(int gears, String color){
      this.gears = gears;
      this.color = color; 
      } 
   public static String getColor(){
      return color; 
      }
   public static int getGears(){
      return gears; 
      }
   public static void ride(){
      riding = "I'm riding my bike";
      } 
}