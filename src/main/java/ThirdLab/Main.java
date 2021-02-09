package ThirdLab;

import ThirdLab.Ability.ActiveAbility.Fall;
import ThirdLab.Ability.ActiveAbility.Shoot;
import ThirdLab.Ability.PassiveAbility.Heard;
import ThirdLab.Objects.Bullet;
import ThirdLab.characters.Cosmonauts;
import ThirdLab.characters.PoliceMan;
//В это время одному полицейскому удалось попасть в ракету
//Послышался звонкий удар.
//Ракета вздрогнула и, потеряв управление, начала переворачиваться в воздухе
//Пуля не смогла пробить прочную стальную оболочку, но, поскольку ракета  находилась в состоянии невесомости,
// толчок ,произведённый пулей был для неё особенно ошутим
//От внезапного изменения курса космонавты попадали со своих мест
public class Main {
    public static void main(String[] args){
        PoliceMan policeMan = new PoliceMan("Полицейский", GenderEnum.MALE);
        Shoot shoot = new Shoot();
        shoot.setGender(GenderEnum.MALE);
        policeMan.addAbility(shoot);
        policeMan.runAbility(shoot);

        Bullet.toHit();
        Rocket.receivedDamage();

        Hit hit = new Hit(Hit.voice +"удар", GenderEnum.MALE);
        Heard heard = new Heard();
        heard.setGender(GenderEnum.MALE);
        hit.addAbility(heard);
        hit.runAbility(heard);

        Rocket.shuddered();
        Bullet.struck();
        Rocket.felt();

        Cosmonauts cosmonauts = new Cosmonauts("Космонавты", GenderEnum.MULTIPLE);
        Fall fall = new Fall();
        fall.setGender(GenderEnum.MULTIPLE);
        cosmonauts.addAbility(fall);
        cosmonauts.runAbility(fall);
    }
}
//полицейский стреляет в ракету
//полицейский(пуля?) попадает в ракету
//ракета получает урон

//Создать пакет characters, наследвать класс policeMan от него и добавить ему метод пистолет