package ThirdLab.Ability.PassiveAbility;
import ThirdLab.GenderEnum;
public interface PassiveAbility {
    String run();
    void setGender(GenderEnum gender);
    GenderEnum getGender();
}
