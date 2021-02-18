package thirdLab.ability.passiveAbility;

import thirdLab.GenderEnum;

public class Heard implements PassiveAbility{
    private GenderEnum gender;

    @Override
    public String run() {
        String heard;
        switch (gender) {
            case MALE:
                heard = " послышался";
                break;
            case FEMALE:
                heard = " послышалась";
                break;
            default:
                heard = " послышались";
        }
        return heard ;
    }

    @Override
    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    @Override
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
