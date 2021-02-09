package ThirdLab.Objects;

public class Pistol {
    public static int numberOfBullets = 6;
    public static void overcharge(){
        if (numberOfBullets == 0){
            numberOfBullets+=6;
        }
    }
}

