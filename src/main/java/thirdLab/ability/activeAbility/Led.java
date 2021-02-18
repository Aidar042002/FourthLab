package thirdLab.ability.activeAbility;

import thirdLab.GenderEnum;

public class Led implements ActiveAbility{
    private GenderEnum gender;
    private String ship = " корабль";

    @Override
    public String run() {
        String led;
        switch (gender) {
            case MALE:
                led = " повёл";
                break;
            case FEMALE:
                led = "повела";
                break;
            default:
                led = " повели";
        }
        return led + ship + " на снижение " ;
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
