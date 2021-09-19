import java.util.concurrent.ThreadLocalRandom;

/**
Dies ist die Klasse Battle, in der der Kampf stattfindet.
*/
public class Battle {

    /**
    Diese Methode startet den Kampf
     */
    public void startBattle() {

        int runde = 1;
        int maxRunden = 10;
        
        System.out.println("An Orc emerges, ready for battle!");

    
        Weapon weapon = new Weapon();
                    
        Hobbit frodo = new Hobbit(weapon.setWeapon());

        frodo.setName("Frodo");

        Hobbit sam = new Hobbit(weapon.setWeapon());

        sam.setName("Sam");

        Hobbit meri = new Hobbit(weapon.setWeapon());

        meri.setName("Meri");

        Hobbit pipin = new Hobbit(weapon.setWeapon());

        pipin.setName("Pipin");
    
        do {
            System.out.println("Round " + runde);
            
            Orc orc = new Orc(weapon.setWeapon());

            do {

                int deal = frodo.attack();

                System.out.println("Frodo " + frodo.getWeapon() + " dealt " + deal + " damage");

                int orcDeal = orc.attack();

                System.out.println("Orc " + orc.getWeapon() + " dealt " + orcDeal + " damage");

                orc.recvDamage(deal);

                frodo.recvDamage(orcDeal);

                deal = sam.attack();

                System.out.println("Sam " + sam.getWeapon() + " dealt " + deal + " damage");

                orcDeal = orc.attack();

                System.out.println("Orc " + orc.getWeapon() + " dealt " + orcDeal + " damage");

                orc.recvDamage(deal);

                sam.recvDamage(orcDeal);

                deal = meri.attack();

                System.out.println("Meri " + meri.getWeapon() + " dealt " + deal + " damage");

                orcDeal = orc.attack();

                System.out.println("Orc " + orc.getWeapon() + " dealt " + orcDeal + " damage");

                orc.recvDamage(deal);

                meri.recvDamage(orcDeal);

                deal = pipin.attack();

                System.out.println("Pipin " + pipin.getWeapon() + " dealt " + deal + " damage");

                orcDeal = orc.attack();

                System.out.println("Orc " + orc.getWeapon() + " dealt " + orcDeal + " damage");

                orc.recvDamage(deal);

                pipin.recvDamage(orcDeal);

                int aura = ThreadLocalRandom.current().nextInt(0, 16);

                frodo.healed(aura);

                sam.healed(aura);

                meri.healed(aura);

                pipin.healed(aura);

                System.out.println("The aura healed everybody by " + aura);

                if ((frodo.isAlive() == false) && (sam.isAlive() == false) && (meri.isAlive() == false) && (pipin.isAlive() == false)) {

                    System.out.println("The round is over! The ork has won.");

                    break;
                    
                } else if (orc.isAlive() == false) {

                    System.out.println("The round is over! The hobbits have won, the ork died.");

                    break;
                }

            }
            while (true);
    
            runde++;
    
        }
        while (runde <= maxRunden);

        if (((frodo.isAlive() == true) || (sam.isAlive() == true) || (meri.isAlive() == true) || (pipin.isAlive() == true))) {
        
            System.out.println("The fellowship won, all orks are dead!");

        }
    }
}