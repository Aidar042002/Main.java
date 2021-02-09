package ThirdLab.Ability.ActiveAbility;
import ThirdLab.GenderEnum;

public interface ActiveAbility {
    String run();
    void setGender(GenderEnum gender);
    GenderEnum getGender();
}
