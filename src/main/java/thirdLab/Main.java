package thirdLab;

import thirdLab.ability.activeAbility.Fall;
import thirdLab.ability.activeAbility.Led;
import thirdLab.ability.activeAbility.See;
import thirdLab.ability.activeAbility.Shoot;
import thirdLab.ability.passiveAbility.Heard;
import thirdLab.ability.passiveAbility.Noticed;
import thirdLab.ability.passiveAbility.Think;
import thirdLab.characters.Cosmonauts;
import thirdLab.characters.Glass;
import thirdLab.characters.PoliceMan;
import thirdLab.characters.Znaica;
import thirdLab.exceptions.NotShootException;
import thirdLab.objects.Bullet;

public class Main {
    public static void main(String[] args){

        Znaica znaica = new Znaica("Знайка",GenderEnum.MALE);
        final Led led = new Led();
        led.setGender(GenderEnum.MALE);
        znaica.addAbility(led);
        znaica.runAbility(led);

        Glass glass = new Glass("Стекляшкин", GenderEnum.MALE);
        See saw = new See();
        saw.setGender(GenderEnum.MALE);
        glass.addAbility(saw);
        glass.runAbility(saw);
        PoliceMan severalPolice = new PoliceMan(" полицейских",GenderEnum.MULTIPLE);
        severalPolice.severalPoliceman();

        Glass he = new Glass("Он",GenderEnum.MALE);
        Think think = new Think();
        think.setGender(GenderEnum.MALE);
        he.addAbility(think);
        he.runAbility(think);
        System.out.print("Но ");
        Noticed noticed = new Noticed();
        noticed.setGender(GenderEnum.MALE);
        he.addAbility(noticed);
        he.runAbility(noticed);

        PoliceMan policeMan = new PoliceMan("Полицейский", GenderEnum.MALE);
        Shoot shoot = new Shoot();
        shoot.setGender(GenderEnum.MALE);
        policeMan.addAbility(shoot);
        policeMan.runAbility(shoot);
        System.out.print(" и");
        Rocket partOfTheRocket = new Rocket();
        Rocket.RocketSatellite rocketSatellite = partOfTheRocket.new RocketSatellite();
        rocketSatellite.addSatellite();
        System.out.println();

        Bullet bullet = new Bullet();
        bullet.toHit();
        Rocket rocket = new Rocket();
        rocket.receivedDamage();

        Hit hit = new Hit(Hit.voice +"удар", GenderEnum.MALE);
        Heard heard = new Heard();
        heard.setGender(GenderEnum.MALE);
        hit.addAbility(heard);
        hit.runAbility(heard);

        Rocket shuddered = new Rocket();
        shuddered.shuddered();
        Bullet struck = new Bullet();
        struck.struck();
        Rocket felt = new Rocket();
        felt.felt();

        Cosmonauts cosmonauts = new Cosmonauts("Космонавты", GenderEnum.MULTIPLE);
        Fall fall = new Fall();
        fall.setGender(GenderEnum.MULTIPLE);
        cosmonauts.addAbility(fall);
        cosmonauts.runAbility(fall);

        try {
            shoot.notShoot(znaica);
            shoot.notShoot(cosmonauts);
            shoot.notShoot(glass);
        }catch (NotShootException e){
            System.err.println(e.getMessage());
        }
    }
}

/*Знайка повел корабль на снижение, и Стекляшкин увидел на крышах домов полицейских, вооруженных винтовками.
Сначала он подумал, что у них в руках просто палки,
но вскоре заметил, что из этих "палок" как бы вырываются огоньки вспышек с белыми облачками дыма.
 В это время одному полицейскому удалось попасть в ракету.
 Послышался звонкий удар.
 Ракета вздрогнула и, потеряв управление, начала переворачиваться в воздухе.
 Пуля не смогла пробить прочную стальную оболочку,
 но, поскольку ракета находилась в состоянии невесомости, толчок, произведенный пулей, был для нее особенно ощутим.
 От внезапного изменения курса космонавты попадали со своих мест. Произошло замешательство
*/
