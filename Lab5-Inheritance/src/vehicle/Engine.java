package vehicle;

/**
 *
 * @author Polis
 */
public class Engine {
    private int cubic_capacity;
    private int horsepower;

    public Engine(int cubic_capacity, int horsepower) {
        this.cubic_capacity = cubic_capacity;
        this.horsepower = horsepower;
    }

    public int getCubic_capacity() {
        return cubic_capacity;
    }

    public int getHorsepower() {
        return horsepower;
    }
    
    public void leitourgia() {
        System.out.println("Vazei empros...");
    }
    
    public void kinisiAr() {
        System.out.println("Strivei aristera...");
    }
    
    public void kinisiDe() {
        System.out.println("Strivei dexia...");
    }
    
    public void svisimo() {
        System.out.println("Svinei...");
    }

    @Override
    public String toString() {
        return "Engine{" + "cubic_capacity=" + cubic_capacity + ", horse_power=" + horsepower + '}';
    }
    
}