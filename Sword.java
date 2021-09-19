/** Dies ist die Klasse Sword */
public class Sword extends Weapon {
    
    private int min = 20;
    private int max = 30;

    private String name;

    /** Dies ist der Default-Konstruktor */
    public Sword() {

    }

    /** Konstruktor-Überladung, damit ein Waffenname gegeben werden könnte
    @param name String, der den Waffennamen enthält
     */
    public Sword(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMin() {
        return this.min;
    }

    public int getMax() {
        return this.max;
    }
}
