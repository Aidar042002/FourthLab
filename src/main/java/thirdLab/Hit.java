package thirdLab;

import thirdLab.ability.passiveAbility.PassiveAbility;

import java.util.ArrayList;
import java.util.List;

public class Hit {
    private GenderEnum gender;
    private String name;
    public static String voice = "Звонкий ";
    private final List<PassiveAbility> passiveAbilities = new ArrayList();

    public Hit(String name, GenderEnum gender){
        this.name = name;
        this.gender = gender;
    }

    public void addAbility(PassiveAbility ability) {
        passiveAbilities.add(ability);
    }

    public void runAbility(PassiveAbility ability) {
        System.out.println(name + " " + ability.run());
    }

    public boolean checkAbility(PassiveAbility ability) {
        boolean abilityExists = passiveAbilities.contains(ability);
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
}
