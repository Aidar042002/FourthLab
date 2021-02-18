package thirdLab.objects;

public class Pistol {
    private String pistol = " пистолет";

    public int numberOfBullets = 6;

    public void reload(){
        if (numberOfBullets == 0){
            numberOfBullets+=6;
        }
    }
}
