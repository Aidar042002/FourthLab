package thirdLab;

import thirdLab.objects.Bullet;
import thirdLab.objects.Pistol;

public class Rocket {
    private int numberOfProtection = 100;
    private String name = "Ракета";
    private String damage= "урон";
    private String discontrol =" потеряла управление";
    private String overTurn = " переварачивается";
    private String condition = "невесомость";

    Pistol pistol = new Pistol();
    public void receivedDamage(){
        if(pistol.numberOfBullets == 6){
            numberOfProtection-=100;
            System.out.println(name + " получила " + damage);
            numberOfProtection = 0;
        }
        else {
            System.out.println(name + " не получила урон " + damage);
        }
    }

    public void shuddered(){
        if(numberOfProtection == 0){
            String shuddered =" вздрогнула";
            System.out.print(name + shuddered);
            if (shuddered == " вздрогнула"){
                System.out.print(discontrol + " и " + overTurn+ "\n");
            }
        }
    }

    Bullet bullet = new Bullet();
    public void felt(){
        if (condition == "невесомость"){
            System.out.println(bullet.push + " был ощутим");
            String course = "изменился";
        }
        else {
            System.out.println(bullet.push + " не был ощутим");
        }
    }

    class RocketSatellite{
        private String satelliteName =" спутник";

        public void addSatellite(){
            System.out.print(satelliteName);
        }
    }
}
