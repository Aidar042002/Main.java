package ThirdLab.Ability.ActiveAbility;

import ThirdLab.Ability.ActiveAbility.ActiveAbility;
import ThirdLab.GenderEnum;

public class Shoot implements ActiveAbility {
    private GenderEnum gender;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String run() {
        String shoot;
        switch (gender) {
            case MALE:
                shoot = " выстрелил";
                break;
            case FEMALE:
                shoot = "выстрелила";
                break;
            default:
                shoot = "выстрелили";
        }
        return shoot + "  в ракету ";
    }

    @Override
    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    @Override
    public GenderEnum getGender() {
        return gender;
    }
}
