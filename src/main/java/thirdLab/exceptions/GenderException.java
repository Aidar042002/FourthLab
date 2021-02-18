package thirdLab.exceptions;

import thirdLab.GenderEnum;

public class GenderException extends RuntimeException{
    public GenderException(GenderEnum gender){
        super("В городе появился неизвестный гендер: " + gender);
    }
}
