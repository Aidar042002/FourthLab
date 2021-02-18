package thirdLab.ability.passiveAbility;

import thirdLab.GenderEnum;

public class Noticed implements PassiveAbility{
    private GenderEnum gender;

    @Override
    public String run() {
        String noticed;
        switch (gender) {
            case MALE:
                noticed = "заметил";
                break;
            case FEMALE:
                noticed = " заметила";
                break;
            default:
                noticed = " заметили";
        }
        return noticed + " что это пистолет";
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
