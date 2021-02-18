package thirdLab.characters;

import thirdLab.GenderEnum;
import thirdLab.ability.activeAbility.ActiveAbility;
import thirdLab.ability.passiveAbility.PassiveAbility;
import thirdLab.objects.Pistol;

import java.util.ArrayList;
import java.util.List;

public class PoliceMan extends Character{
    private String name;
    private GenderEnum gender;
    private final List<PassiveAbility> passiveAbilities = new ArrayList();
    private final List<ActiveAbility> activeAbilities = new ArrayList();
    private String shoot = "стрелять";

    Pistol numberOfBullets = new Pistol();
    Pistol reload = new Pistol();

    public void abilityToShoot(){
        if (numberOfBullets.numberOfBullets == 0){
            reload.reload();
        }
    }

    public PoliceMan(String name, GenderEnum gender) {
        super(name, gender);
        /*this.name = name;
        this.gender = gender;*/
    }

    /*class PoliceMans{
        private String name;

        public void policeMans(String name){
            System.out.println(name);
        }
    }

    PoliceMans policeMans = new PoliceMans(){
       public void policeMans(){
           System.out.println(" полицейских");
       }
    };*/
    private static class PoliceMans {
        private String name;

        public void lotOfPolice(){
            System.out.print(name);
        }
    }

    PoliceMans lotPolice = new PoliceMans() {
        public void lotOfPolice(){
            System.out.print(" полицейских"+ "\n");
        }
    };
    public void severalPoliceman(){
        lotPolice.lotOfPolice();
    }
}
