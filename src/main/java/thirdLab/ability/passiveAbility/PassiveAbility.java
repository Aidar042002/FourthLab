package thirdLab.ability.passiveAbility;

import thirdLab.GenderEnum;

public interface PassiveAbility {
    String run();
    void setGender(GenderEnum gender);
    GenderEnum getGender();
}
