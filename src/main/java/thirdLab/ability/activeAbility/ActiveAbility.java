package thirdLab.ability.activeAbility;

import thirdLab.GenderEnum;

public interface ActiveAbility {
    String run();
    void setGender(GenderEnum gender);
    GenderEnum getGender();
}
