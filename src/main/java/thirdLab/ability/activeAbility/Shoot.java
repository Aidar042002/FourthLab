package thirdLab.ability.activeAbility;

import thirdLab.GenderEnum;
import thirdLab.characters.Character;
import thirdLab.exceptions.NotShootException;

import java.util.ArrayList;
import java.util.List;

public class Shoot implements ActiveAbility{
    private GenderEnum gender;
    protected List<Character> characters = new ArrayList();

    protected String notShootMessage(Character character) {
        if (characters.contains(character)) {
            if (character.getGender() == GenderEnum.FEMALE)
                return character.getName() + " она не может стрелять";
            if (character.getGender() == GenderEnum.MALE)
                return character.getName() + " он не может стрелять";
            return character.getName() + " они не могут стрелять в ";
        }
        if (character.getGender() == GenderEnum.FEMALE)
            return character.getName() + " выстрелила ";
        if (character.getGender() == GenderEnum.MALE)
            return character.getName() + " выстрелил в ";
        return character.getName() + " выстрелили в ";
    }

    public void notShoot(Character character) throws NotShootException {
        String enterMessage = notShootMessage(character) + "ракету ";
        if (!characters.contains(character)) {
            characters.add(character);
            System.out.println(enterMessage);
        }
        throw new NotShootException(enterMessage);
    }

    @Override
    public String run() {
        String shoot;
        switch (gender) {
            case MALE:
                shoot = " выстрелил";
                break;
            case FEMALE:
                shoot = "выстрелила";
                break;
            default:
                shoot = "выстрелили";
        }
        return shoot + "  в ракету ";
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
