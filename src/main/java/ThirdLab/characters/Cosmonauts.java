package ThirdLab.characters;

import ThirdLab.Ability.ActiveAbility.ActiveAbility;
import ThirdLab.Ability.ActiveAbility.Fall;
import ThirdLab.Ability.PassiveAbility.PassiveAbility;
import ThirdLab.GenderEnum;
import ThirdLab.Objects.Pistol;

import java.util.ArrayList;
import java.util.List;

public class Cosmonauts extends Character{
    private String name;
    private GenderEnum gender;
    private final List<PassiveAbility> passiveAbilities = new ArrayList();
    private final List<ActiveAbility> activeAbilities = new ArrayList();

    public Cosmonauts(String name, GenderEnum gender) {
        super(name, gender);
        this.name = name;
        this.gender = gender;
    }

    public void addAbility(PassiveAbility ability) {
        passiveAbilities.add(ability);
    }

    public void addAbility(ActiveAbility ability) {
        activeAbilities.add(ability);
    }

    public void runAbility(PassiveAbility ability) {
        if (checkAbility(ability)) {
            System.out.println(name + " " + ability.run());
        }
    }

    // *перегружается*
    public void runAbility(ActiveAbility ability) {
        System.out.println(name + " " + ability.run());
    }

    public boolean checkAbility(PassiveAbility ability) {
        boolean abilityExists = passiveAbilities.contains(ability);
        if (!abilityExists)
            System.out.println(name + " не может использовать способность " + ability);
        return abilityExists;
    }

    // *и этот перегружается*
    public boolean checkAbility(ActiveAbility ability) {
        boolean abilityExists = activeAbilities.contains(ability);
        if (!abilityExists)
            System.out.println(name + " не может использовать способность " + ability);
        return abilityExists;
    }

    public String getName() {
        return name;
    }

    public GenderEnum getGender() {
        return gender;
    }

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

}
