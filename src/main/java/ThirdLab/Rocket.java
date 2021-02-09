package ThirdLab;

import ThirdLab.Objects.Bullet;
import ThirdLab.Objects.Pistol;

public class Rocket {
    private static int numberOfProtection = 100;
    private static String name = "Ракета";
    private static String damage= "урон";
    private static String discontrol =" потеряла управление";
    private static String overTurn = " переварачивается";
    private static String condition = "невесомость";

    public static void receivedDamage(){
        if(Pistol.numberOfBullets == 6){
            numberOfProtection-=100;
            System.out.println(name + " получила " + damage);
            numberOfProtection = 0;
        }
        else {
            System.out.println(name + " не получила урон " + damage);
        }
    }

    public static void shuddered(){
        if(numberOfProtection == 0){
            String shuddered =" вздрогнула";
            System.out.print(name + shuddered);
            if (shuddered == " вздрогнула"){
                System.out.print(discontrol + " и " + overTurn+ "\n");
            }
        }
    }

    public static void felt(){
        if (condition == "невесомость"){
            System.out.println(Bullet.push + " был ощутим");
            String course = "изменился";
        }
        else {
            System.out.println(Bullet.push + " не был ощутим");
        }
    }
}
