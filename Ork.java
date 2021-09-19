import java.util.concurrent.ThreadLocalRandom;

public class Ork {
    
    int lp = ThreadLocalRandom.current().nextInt(80, 151);

    public void recvDamage(int randomDamage){

        lp = lp - randomDamage;
    }

    public int attack(int randomDamage) {


        return randomDamage;
    }

    public boolean isAlive() {

        
        if (lp > 0) {

            return true;
        } 
        else {
            return false;
        }
         
    }
}
