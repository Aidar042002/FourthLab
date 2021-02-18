package thirdLab.ability.activeAbility;

import thirdLab.GenderEnum;

public class Fall implements ActiveAbility{
    private GenderEnum gender;

    @Override
    public String run() {
        String fall;
        switch (gender) {
            case MALE:
                fall = " попадал";
                break;
            case FEMALE:
                fall = " попадала";
                break;
            default:
                fall = " попадали";
        }
        return fall + " с мест" + "\n" + "Произошло замешательство";
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
