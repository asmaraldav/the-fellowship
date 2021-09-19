import java.util.concurrent.ThreadLocalRandom;

/** Dies ist die Klasse Orc
 */
public class Orc {
    private Weapon weaponHold;
    private String weaponKind;
    
    private int lp = ThreadLocalRandom.current().nextInt(80, 151);

    /** Dies ist der Konstruktor der Klasse Orc
    @param weaponKind String, der den Waffentypen enthält
     */
    public Orc(String weaponKind) {
        this.weaponKind = weaponKind;
        if (weaponKind.equals("Sword")) {
            
            weaponHold = new Sword();

        } else {
            weaponHold = new Fists();
        }
    }

    public String getWeapon() {
        return weaponKind;
    }
   
   /** diese Methode zieht den Schaden von den Lebenspunkten ab und man erhält somit die nach dem Angriff noch übrigen Lebenspunkte.
   @param damage numerischer Wert, der von den Lebenspunkten subtrahiert wird
   */
    public void recvDamage(int damage) {

        lp = lp - damage;
    }

    /** Diese Methode gibt den Schaden, den der Angriff ausgelöst hat, zurück
    @return Wert des Schadens */
    public int attack() {
        
        int damage = weaponHold.dealDamage(weaponHold.getMin(), weaponHold.getMax());
        return damage;
    }

    /** Diese Methode gibt zurück, ob der Hobbit noch Lebenspunkte besitzt
    @return wenn der Orc noch Lebenspunkte besitzt, dann wird true zurückgegeben, sonst false */
    
    public boolean isAlive() {

        
        if (lp > 0) {

            return true;

        } else {
            return false;
        }
         
    }
}
