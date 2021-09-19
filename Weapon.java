import java.util.concurrent.ThreadLocalRandom;

/** Dies ist die Klasse Weapon
*/
public class Weapon {    

    /** Diese Methode errechnet zufällig den Wert des Schadens
    @return Wert des Schadens
    @param min minimaler numerischer Wert, den der Schaden annehmen kann
    @param max maximaler numerischer Wert, den der Schaden annehmen kann
    */
    public int dealDamage(int min, int max) {

        int randomDamage = ThreadLocalRandom.current().nextInt(min, (max + 1));
            
        return randomDamage;
        
    }

    /** Diese Methode setzt die Waffe zufällig 
    @return  gibt zurück, ob der Orc Sword oder Fists als Waffe trägt
    */
    public String setWeapon() {

        int x = ThreadLocalRandom.current().nextInt(0, 2);

        if (x == 0) {

            return "Sword";

        } else {
            return "Fists";
        }
    }

    public int getMin() {
        return 0;
    }

    public int getMax() {
        return 0;
    }



    


}
