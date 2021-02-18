package thirdLab.ability.passiveAbility;

import thirdLab.GenderEnum;

public class Think implements PassiveAbility{
    private GenderEnum gender;

    @Override
    public String run() {
        String think;
        switch (gender) {
            case MALE:
                think = " подумал";
                break;
            case FEMALE:
                think = " подумала";
                break;
            default:
                think = " подумали";
        }
        return think + " что это палки" ;
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
