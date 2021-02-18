package thirdLab.characters;

import thirdLab.GenderEnum;
import thirdLab.ability.activeAbility.ActiveAbility;
import thirdLab.ability.passiveAbility.PassiveAbility;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Character {
    private final String name;
    private final GenderEnum gender;
    private final List<PassiveAbility> passiveAbilities = new ArrayList();
    private final List<ActiveAbility> activeAbilities = new ArrayList();

    public Character(String name, GenderEnum gender) {
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
        System.out.println(name + " " + ability.run());
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

    public String getName(){
        return name;
    }

    public GenderEnum getGender(){
        return gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, passiveAbilities, activeAbilities);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name) && gender == character.gender && Objects.equals(passiveAbilities, character.passiveAbilities) && Objects.equals(activeAbilities, character.activeAbilities);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", passiveAbilities=" + passiveAbilities +
                ", activeAbilities=" + activeAbilities +
                '}';
    }
}
