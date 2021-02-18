package thirdLab.objects;

public class Bullet {
    private final String name = "Пуля";
    private final String shell = " оболочка";
    private final String stale = " стальная";
    public final String push = "Толчок";
    Pistol pistol =new Pistol();

    public void toHit(){
        if (pistol.numberOfBullets == 6) {
            System.out.println(name + " попала в ракету");
        }
        else {
            System.out.println(name + "не попал в ракету");
        }
    }

    public void struck(){
        if (stale == " стальная" || shell == " оболочка"){
            System.out.println(name + " не пробила оболочку");
        }
        else {
            System.out.println(name + " пробила оболочку");
        }
    }

}
