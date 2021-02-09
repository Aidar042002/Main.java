package ThirdLab.Objects;

import static ThirdLab.Objects.Pistol.numberOfBullets;

public class Bullet {
    private static String name = "Пуля";
    private static String shell = " оболочка";
    private static String stale = " стальная";
    public static String push = "Толчок";

   public static void toHit(){
       if (numberOfBullets == 6) {
           System.out.println(name + " попала в ракету");
       }
       else {
           System.out.println(name + "не попал в ракету");
       }
   }

   public static void struck(){
       if (stale == " стальная" || shell == " оболочка"){
           System.out.println(name + " не пробила оболочку");
       }
       else {
           System.out.println(name + " пробила оболочку");
       }
   }

}
