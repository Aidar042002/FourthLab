package thirdLab.ability.activeAbility;

import thirdLab.GenderEnum;

public class See implements ActiveAbility{
    private GenderEnum gender;

    @Override
    public String run() {
        String saw;
        switch (gender) {
            case MALE:
                saw = " увидел";
                break;
            case FEMALE:
                saw = " увидела";
                break;
            default:
                saw = " увидели";
        }
        return saw ;
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
