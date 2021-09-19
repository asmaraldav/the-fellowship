
/**
Dies ist die Klasse Hobbit.
*/
public class Hobbit {
    private String name;
    private String weaponKind;
    private int lp = 100;

    private Weapon weaponHold;

    /**
    Dies ist der Konstruktor der Klasse Hobbit
    @param weaponKind String, der den Waffentyp enthält
    */

    public Hobbit(String weaponKind) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
    Diese Methode zieht den Schaden von den Lebenspunkten ab und man erhält somit die nach dem Angriff noch übrigen Lebenspunkte.
    @param damage numerischer Wert, der von den Lebenspunkten subtrahiert wird
    */

    public void recvDamage(int damage) {

        lp = lp - damage;
    }

    /**
    Diese Methode gibt den Schaden zurück, den der Angriff auslöst.
    @return Wert des Schadens
    */

    public int attack() {
       
        if (lp > 0) {
            int damage = weaponHold.dealDamage(weaponHold.getMin(), weaponHold.getMax());
        
            return damage;

        } else {
           
            return 0;
        }
        
    }

    /**
    Diese Methode kontrolliert, ob der Hobbit noch Lebenspunkte besitzt.
    @return wenn der Hobbit noch Lebenspunkte besitzt, dann wird true zurückgegeben, sonst false
    */

    public boolean isAlive() {

        
        if (lp > 0) {

            return true;

        } else {

            return false;
        }
         
    }

    /**
    Diese Methode ist die Aura, die die Hobbits heilt, nachdem jeder Hobbit einmal den Orc angegriffen hat.
    @param aura numerischer Wert der auf die Lebenspunkte addiert wird.
    */
    public void healed(int aura) {

        if (lp > 0) {
           
            lp = lp + aura;
        }
    }

}
