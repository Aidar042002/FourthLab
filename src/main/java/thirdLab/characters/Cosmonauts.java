package thirdLab.characters;

import thirdLab.GenderEnum;
import thirdLab.ability.activeAbility.ActiveAbility;
import thirdLab.ability.passiveAbility.PassiveAbility;

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
}
